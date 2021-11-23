/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.check;
/* 이클래스는 체크 아웃을  정보를 처리하는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class CheckOutInformation {
    private String index;           //인덱스
    private String room;            //호실
    private String roomState;       //방상태
    private String booker;          //예약자명
    private String guestNum;        //인원
    private String inDate;          //체크인 날짜
    private String outTime;         //체크아웃 시간
    private String realOutTime;     //실제 체크아웃 시간

    public CheckOutInformation(String index, String room, String roomState, String booker, String guestNum, 
            String inDate, String outTime, String realOutTime) {
        this.index = index;
        this.room = room;
        this.roomState = roomState;
        this.booker = booker;
        this.guestNum = guestNum;
        this.inDate = inDate;
        this.outTime = outTime;
        this.realOutTime = realOutTime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(String guestNum) {
        this.guestNum = guestNum;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getRealOutTime() {
        return realOutTime;
    }

    public void setRealOutTime(String realOutTime) {
        this.realOutTime = realOutTime;
    }
}
