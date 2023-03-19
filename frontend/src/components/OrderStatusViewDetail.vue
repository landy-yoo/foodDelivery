<template>

    <v-card outlined>
        <v-card-title>
            OrderStatus # {{$route.params.id }}
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
                <String label="MenuPrice" v-model="item.menuPrice" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="OrderDt" v-model="item.orderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="CancelOrderDt" v-model="item.cancelOrderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="PayDt" v-model="item.payDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="CancelPayDt" v-model="item.cancelPayDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="AcceptOrderDt" v-model="item.acceptOrderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="RejectOrderDt" v-model="item.rejectOrderDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="StartCookDt" v-model="item.startCookDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="FinishCookDt" v-model="item.finishCookDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="VanAccpteNo" v-model="item.vanAccpteNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="VanCancelNo" v-model="item.vanCancelNo" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="RiderPickDt" v-model="item.riderPickDt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="FinishDeliveryDt" v-model="item.finishDeliveryDt" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'OrderStatusViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/orderStatuses/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

