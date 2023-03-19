<template>

    <v-data-table
        :headers="headers"
        :items="deliveryStatus"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DeliveryStatusView',
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
                { text: "menuPirce", value: "menuPirce" },
                { text: "startCookYn", value: "startCookYn" },
                { text: "payCancelYn", value: "payCancelYn" },
                { text: "orderCancelYn", value: "orderCancelYn" },
                { text: "deliveryYn", value: "deliveryYn" },
                { text: "orderDt", value: "orderDt" },
                { text: "payDt", value: "payDt" },
                { text: "payAcceptId", value: "payAcceptId" },
                { text: "startCookDt", value: "startCookDt" },
                { text: "startDeliveryDt", value: "startDeliveryDt" },
                { text: "orderCancelDt", value: "orderCancelDt" },
                { text: "orderToStoreDt", value: "orderToStoreDt" },
                { text: "acceptOrderDt", value: "acceptOrderDt" },
                { text: "cancelStoreDt", value: "cancelStoreDt" },
                { text: "payVanNo", value: "payVanNo" },
            ],
            deliveryStatus : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/deliveryStatuses'))

            temp.data._embedded.deliveryStatuses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.deliveryStatus = temp.data._embedded.deliveryStatuses;
        },
        methods: {
        }
    }
</script>

