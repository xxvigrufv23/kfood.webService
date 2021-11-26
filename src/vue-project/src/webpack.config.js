const path = require('path');

module.exports = {
    rules: [
        {
        test: /\.scss$/,
        use: [
            'vue-style-loader',
            'css-loader',
            {
                loader:'sass-loader',
                options: {
                    additionalData: '@import "@/assets/scss/_common.scss"'
                }
            }
        ]
        }
    ]
};