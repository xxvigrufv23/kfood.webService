import api from '@/api/index.js';
import EventBus from '@/plugins/EventBus.js';

export default { 
    LOGIN(_, payload) {
        return api
        .login(payload)
        .then(res => {
            return res;
        })
        .catch(() => {
            const content = {
                title: '로그인실패',
            };
            // EventBus.$emit('event-bus-dialog', content);
        })
    }, 

    GET_ADMIN_BASE({ commit }) {
        return api
        .get_admin_base()
        .then(res => {
            return res;
        })
        .catch(() => {});
    }
}