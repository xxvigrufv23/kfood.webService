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
        component: () => import('@/views/Admin')
    },
    {
        path: '/databinding',
        name: 'DataBinding',
        component: () => import('@/views/DataBinding')
    }
]

export const router = createRouter({
    history: createWebHistory(),
    routes,
});