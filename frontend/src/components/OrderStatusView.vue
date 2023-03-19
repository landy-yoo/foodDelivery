<template>

    <v-data-table
        :headers="headers"
        :items="orderStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderStatusView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "customerId", value: "customerId" },
                { text: "customerName", value: "customerName" },
                { text: "storeId", value: "storeId" },
                { text: "storeName", value: "storeName" },
                { text: "menuId", value: "menuId" },
                { text: "menuName", value: "menuName" },
                { text: "menuPrice", value: "menuPrice" },
                { text: "orderDt", value: "orderDt" },
                { text: "cancelOrderDt", value: "cancelOrderDt" },
                { text: "payDt", value: "payDt" },
                { text: "cancelPayDt", value: "cancelPayDt" },
                { text: "acceptOrderDt", value: "acceptOrderDt" },
                { text: "rejectOrderDt", value: "rejectOrderDt" },
                { text: "startCookDt", value: "startCookDt" },
                { text: "finishCookDt", value: "finishCookDt" },
                { text: "vanAccpteNo", value: "vanAccpteNo" },
                { text: "vanCancelNo", value: "vanCancelNo" },
                { text: "riderPickDt", value: "riderPickDt" },
                { text: "finishDeliveryDt", value: "finishDeliveryDt" },
            ],
            orderStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderStatuses'))

            temp.data._embedded.orderStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderStatus = temp.data._embedded.orderStatuses;
        },
        methods: {
        }
    }
</script>

