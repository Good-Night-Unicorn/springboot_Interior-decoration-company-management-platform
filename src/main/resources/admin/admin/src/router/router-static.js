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
    import zhuangxiupingjia from '@/views/modules/zhuangxiupingjia/list'
    import yuangong from '@/views/modules/yuangong/list'
    import zhuangxiushigong from '@/views/modules/zhuangxiushigong/list'
    import zhuangxiucailiao from '@/views/modules/zhuangxiucailiao/list'
    import zhuangxiudingdan from '@/views/modules/zhuangxiudingdan/list'
    import zhuangxiuchengben from '@/views/modules/zhuangxiuchengben/list'
    import cailiaofenlei from '@/views/modules/cailiaofenlei/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/zhuangxiupingjia',
        name: '装修评价',
        component: zhuangxiupingjia
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/zhuangxiushigong',
        name: '装修施工',
        component: zhuangxiushigong
      }
      ,{
	path: '/zhuangxiucailiao',
        name: '装修材料',
        component: zhuangxiucailiao
      }
      ,{
	path: '/zhuangxiudingdan',
        name: '装修订单',
        component: zhuangxiudingdan
      }
      ,{
	path: '/zhuangxiuchengben',
        name: '装修成本',
        component: zhuangxiuchengben
      }
      ,{
	path: '/cailiaofenlei',
        name: '材料分类',
        component: cailiaofenlei
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
