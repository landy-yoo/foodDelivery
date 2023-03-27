package fooddelivery.infra;

import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusViewHandler {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderChoosed_then_CREATE_1(
        @Payload OrderChoosed orderChoosed
    ) {
        try {
            if (!orderChoosed.validate()) return;

            // view 객체 생성
            OrderStatus orderStatus = new OrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            orderStatus.setCustomerId(orderChoosed.getCustomerId());
            orderStatus.setCustomerName(orderChoosed.getCustomerName());
            orderStatus.setMenuId(orderChoosed.getMenuId());
            orderStatus.setMenuName(orderChoosed.getMenuName());
            orderStatus.setMenuPrice(orderChoosed.getMenuPrice());
            orderStatus.setStatus("주문됨");
            // view 레파지 토리에 save
            orderStatusRepository.save(orderStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderedAccepted_then_UPDATE_1(
        @Payload OrderedAccepted orderedAccepted
    ) {
        try {
            if (!orderedAccepted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                orderedAccepted.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("주문승낙");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaid_then_UPDATE_2(@Payload Paid paid) {
        try {
            if (!paid.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                paid.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("결재됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCancled_then_UPDATE_3(
        @Payload OrderCancled orderCancled
    ) {
        try {
            if (!orderCancled.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                orderCancled.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("결재취소됨");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderedAccepted_then_UPDATE_4(
        @Payload OrderedAccepted orderedAccepted
    ) {
        try {
            if (!orderedAccepted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                orderedAccepted.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("주문확인");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCancled_then_UPDATE_5(
        @Payload OrderCancled orderCancled
    ) {
        try {
            if (!orderCancled.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                orderCancled.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("주문거절");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryStatus_then_UPDATE_6(
        @Payload DeliveryStatus deliveryStatus
    ) {
        try {
            if (!deliveryStatus.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByMenuId(
                deliveryStatus.getMenuId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus("메뉴픽업");
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
