<template>

    <v-card outlined>
        <v-card-title>
            DeliveryStatus # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="CustomerId" v-model="item.customerId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="CustomerName" v-model="item.customerName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="StoreId" v-model="item.storeId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="StoreName" v-model="item.storeName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuId" v-model="item.menuId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuName" v-model="item.menuName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="MenuPirce" v-model="item.menuPirce" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="StartCookYn" v-model="item.startCookYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="PayCancelYn" v-model="item.payCancelYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="OrderCancelYn" v-model="item.orderCancelYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="DeliveryYn" v-model="item.deliveryYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="OrderDt" v-model="item.orderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="PayDt" v-model="item.payDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PayAcceptId" v-model="item.payAcceptId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="StartCookDt" v-model="item.startCookDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="StartDeliveryDt" v-model="item.startDeliveryDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="OrderCancelDt" v-model="item.orderCancelDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="OrderToStoreDt" v-model="item.orderToStoreDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="AcceptOrderDt" v-model="item.acceptOrderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="CancelStoreDt" v-model="item.cancelStoreDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PayVanNo" v-model="item.payVanNo" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DeliveryStatusViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/deliveryStatuses/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

