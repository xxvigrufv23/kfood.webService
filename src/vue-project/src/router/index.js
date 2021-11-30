import {createWebHistory, createRouter} from "vue-router";

const routes = [
    {
        path: '/',
        name: 'Root',
        component: () => import('@/views/Home')
    },
    {
        path: '/home',
        name: 'Home',
        component: () => import('@/views/Home')
    },
    {
        path: '/about',
        name: 'About',
        component: () => import('@/views/About')
    },
    {
        path: '/admin',
        name: 'Admin',
        component: () => import('@/views/admin/Admin')
    },
    {
        path: '/shopping',
        name: 'Shopping',
        component: () => import('@/views/Shopping')
    },
    {
        path: '/member/login',
        name: 'Login',
        component: () => import('@/views/Login')
    },
    {
        path: '/member/signup',
        name: 'SignUp',
        component: () => import('@/views/signup')
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes,
});