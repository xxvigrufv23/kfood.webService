import axios from 'axios'
import { router } from '../router';
import { store } from '../store';
import Vue from 'vue';
Vue.prototype.$axios = axios;



/*
* jaeyoun.choi 20220527
    index.js 파일 생성
*/



axios.interceptors.response.use(
    res => {
        return res;
    },
    err => {
        // store.commit('setLoginInfo', null);
        router.replace({ name: 'OutPage' }).catch(() => {});
        return err;
    
    },
)


const config = {
    baseUrl: process.env.NODE_ENV === 'development' ? process.env.VUE_APP_BASE_URL : process.env.VUE_APP_BASE_URL
}

// function fetchNewList () {
//     return axios.get(`${config.baseUrl}new2/1.json`)
// }

export default{
    // login: config => axios.post('/login', config),
    // get_admin_base: () => axios.get('/api/v2/sfnown/won'),
};