
var projectName = '社区物业管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '楼盘',
	url: './pages/loupan/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm7vwc6/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"楼盘","menuJump":"列表","tableName":"loupan"}],"menu":"楼盘管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"楼盘类型","menuJump":"列表","tableName":"loupanleixing"}],"menu":"楼盘类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"楼盘管理","menuJump":"列表","tableName":"loupanguanli"}],"menu":"楼盘管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"投诉管理","menuJump":"列表","tableName":"tousuguanli"}],"menu":"投诉管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"报修管理","menuJump":"列表","tableName":"baoxiuguanli"}],"menu":"报修管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"业主管理","menuJump":"列表","tableName":"yezhuguanli"}],"menu":"业主管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"停车登记","menuJump":"列表","tableName":"tingchedengji"}],"menu":"停车登记管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印","导出"],"menu":"租户收费管理","menuJump":"列表","tableName":"zuhushoufeiguanli"}],"menu":"租户收费管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印","导出"],"menu":"售户收费管理","menuJump":"列表","tableName":"shouhushoufeiguanli"}],"menu":"售户收费管理"},{"child":[{"buttons":["查看","修改","删除","打印","导出","新增"],"menu":"欠费业主","menuJump":"列表","tableName":"qianfeiyezhu"}],"menu":"欠费业主管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"收费结果","menuJump":"列表","tableName":"shoufeijieguo"}],"menu":"收费结果管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"楼盘列表","menuJump":"列表","tableName":"loupan"}],"menu":"楼盘模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"楼盘","menuJump":"列表","tableName":"loupan"}],"menu":"楼盘管理"},{"child":[{"buttons":["查看","查看评论","修改","新增","删除"],"menu":"投诉管理","menuJump":"列表","tableName":"tousuguanli"}],"menu":"投诉管理"},{"child":[{"buttons":["查看","修改","新增","删除"],"menu":"报修管理","menuJump":"列表","tableName":"baoxiuguanli"}],"menu":"报修管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"停车登记","menuJump":"列表","tableName":"tingchedengji"}],"menu":"停车登记管理"},{"child":[{"buttons":["查看","支付","打印","导出"],"menu":"租户收费管理","menuJump":"列表","tableName":"zuhushoufeiguanli"}],"menu":"租户收费管理"},{"child":[{"buttons":["查看","支付","打印","导出"],"menu":"售户收费管理","menuJump":"列表","tableName":"shouhushoufeiguanli"}],"menu":"售户收费管理"},{"child":[{"buttons":["查看","支付","打印","导出"],"menu":"欠费业主","menuJump":"列表","tableName":"qianfeiyezhu"}],"menu":"欠费业主管理"},{"child":[{"buttons":["查看"],"menu":"收费结果","menuJump":"列表","tableName":"shoufeijieguo"}],"menu":"收费结果管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"楼盘列表","menuJump":"列表","tableName":"loupan"}],"menu":"楼盘模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
