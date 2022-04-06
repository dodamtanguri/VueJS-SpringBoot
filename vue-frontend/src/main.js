import Vue from 'vue'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import BootStrapVue from 'bootstrap-vue'


Vue.use(BootStrapVue)



Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')
