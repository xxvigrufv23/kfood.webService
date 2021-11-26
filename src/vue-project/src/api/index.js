import axios from 'axios'

const config = {
    baseUrl: process.env.NODE_ENV === 'development' ? process.env.VUE_APP_BASE_URL : process.env.VUE_APP_BASE_URL
}

function fetchNewList () {
    return axios.get(`${config.baseUrl}new2/1.json`)
}

export {
    fetchNewList
}