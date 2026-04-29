import java.sql.SQLOutput;

public class ReservationStatusApp {
    public static void main(String[] args) {
        String status = "PENDING";

        System.out.println("현재 예약상태 : " + status);

        if (status.equals("PENDING")){
            status = "APPROVED";
            System.out.println("예약이 승인되었습니다");
        }else if (status.equals("CANCELED")){
            System.out.println("취소된 예약은 승인할수 없습니다.");
        }else if (status.equals("APPROVED")){
            System.out.println("이미 승인된 예약은 승인 할수 없습니다");
        }else {
            System.out.println("예약을 알수 없는 상태입니다");
        }

        System.out.println("최종 예약상태 : " + status);
    }
}
