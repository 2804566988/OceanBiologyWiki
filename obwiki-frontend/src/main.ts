import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/reset.css';
import * as Icons from '@ant-design/icons-vue';
import axios from 'axios';
//获取环境配置的 请求前缀
axios.defaults.baseURL = process.env.VUE_APP_SERVER;

const app = createApp(App);
app.use(store).use(router).use(Antd).mount('#app');

//全局使用图标
const icons: any = Icons;
for (const i in icons) {
  app.component(i, icons[i]);
}

// console.log('环境', process.env.NODE_ENV);
// console.log('服务端', process.env.VUE_APP_SERVER);

/*
* 使用axios拦截器打印请求和响应的数据
* */
// axios.interceptors.request.use(function (config: any) {
//   console.log('请求参数：', config);

//   return config;
// }, error => {
//   return Promise.reject(error);
// });

// axios.interceptors.response.use(function (response) {
//   console.log('返回结果：', response);
//   return response;
// }, error => {
//   console.log('返回错误：', error);
//   return Promise.reject(error);
// });