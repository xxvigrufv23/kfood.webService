const path = require('path')

/*
* jaeyoun.choi 20220527
    vue.config.js 파일 생성
*/




module.exports = {
    // publicPath: '/resources/static',
    outputDir: path.resolve(__dirname, "../" + "main/resources/static"),
    //localhost는 코드 살리고, build 할때는 주석 처리 
    // css: {
    //     loaderOptions: {
    //         scss: { 
    //             additionalDate: '
    //             @import "@/assets/scss/_common.scss";
            
    //             ',
    //         },
    //     },
    // },
    devServer: {
        proxy: {
            '/': {
                target: 'http://localhost:8080',
            },
        }
    }

}