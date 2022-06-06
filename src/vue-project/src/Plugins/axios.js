

//인스턴스 생성
export const apiAxios = axios.create({
    baseURL: process.env.VUE_APP_AXIOS_URL
});

export default apiAxios;