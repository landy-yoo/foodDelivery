
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MenuChoiceManager from "./components/listers/MenuChoiceCards"
import MenuChoiceDetail from "./components/listers/MenuChoiceDetail"
import StoreChoiceManager from "./components/listers/StoreChoiceCards"
import StoreChoiceDetail from "./components/listers/StoreChoiceDetail"

import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"
import PayManager from "./components/listers/PayCards"
import PayDetail from "./components/listers/PayDetail"

import StoreManager from "./components/listers/StoreCards"
import StoreDetail from "./components/listers/StoreDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/menuChoices',
                name: 'MenuChoiceManager',
                component: MenuChoiceManager
            },
            {
                path: '/menuChoices/:id',
                name: 'MenuChoiceDetail',
                component: MenuChoiceDetail
            },
            {
                path: '/storeChoices',
                name: 'StoreChoiceManager',
                component: StoreChoiceManager
            },
            {
                path: '/storeChoices/:id',
                name: 'StoreChoiceDetail',
                component: StoreChoiceDetail
            },

            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },
            {
                path: '/pays/:id',
                name: 'PayDetail',
                component: PayDetail
            },

            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },
            {
                path: '/stores/:id',
                name: 'StoreDetail',
                component: StoreDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },



    ]
})
