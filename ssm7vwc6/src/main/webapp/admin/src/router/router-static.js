import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discusstousuguanli from '@/views/modules/discusstousuguanli/list'
    import baoxiuguanli from '@/views/modules/baoxiuguanli/list'
    import shoufeijieguo from '@/views/modules/shoufeijieguo/list'
    import discussloupan from '@/views/modules/discussloupan/list'
    import storeup from '@/views/modules/storeup/list'
    import yezhuguanli from '@/views/modules/yezhuguanli/list'
    import tingchedengji from '@/views/modules/tingchedengji/list'
    import loupanleixing from '@/views/modules/loupanleixing/list'
    import qianfeiyezhu from '@/views/modules/qianfeiyezhu/list'
    import shouhushoufeiguanli from '@/views/modules/shouhushoufeiguanli/list'
    import loupan from '@/views/modules/loupan/list'
    import tousuguanli from '@/views/modules/tousuguanli/list'
    import zuhushoufeiguanli from '@/views/modules/zuhushoufeiguanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import loupanguanli from '@/views/modules/loupanguanli/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discusstousuguanli',
        name: '投诉管理评论',
        component: discusstousuguanli
      }
      ,{
	path: '/baoxiuguanli',
        name: '报修管理',
        component: baoxiuguanli
      }
      ,{
	path: '/shoufeijieguo',
        name: '收费结果',
        component: shoufeijieguo
      }
      ,{
	path: '/discussloupan',
        name: '楼盘评论',
        component: discussloupan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/yezhuguanli',
        name: '业主管理',
        component: yezhuguanli
      }
      ,{
	path: '/tingchedengji',
        name: '停车登记',
        component: tingchedengji
      }
      ,{
	path: '/loupanleixing',
        name: '楼盘类型',
        component: loupanleixing
      }
      ,{
	path: '/qianfeiyezhu',
        name: '欠费业主',
        component: qianfeiyezhu
      }
      ,{
	path: '/shouhushoufeiguanli',
        name: '售户收费管理',
        component: shouhushoufeiguanli
      }
      ,{
	path: '/loupan',
        name: '楼盘',
        component: loupan
      }
      ,{
	path: '/tousuguanli',
        name: '投诉管理',
        component: tousuguanli
      }
      ,{
	path: '/zuhushoufeiguanli',
        name: '租户收费管理',
        component: zuhushoufeiguanli
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/loupanguanli',
        name: '楼盘管理',
        component: loupanguanli
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
