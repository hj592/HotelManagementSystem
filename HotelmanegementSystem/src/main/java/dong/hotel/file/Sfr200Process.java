/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import dong.hotel.reservation.CustomerInfor;
import dong.hotel.file.SFR100Process;
/**
 *
 * @author nifskorea
 */
public class Sfr200Process  implements Fileinterface { // 고객 정보 예약 관련 클래스 
    
    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<CustomerInfor> guestInfo = new ArrayList<CustomerInfor>();
 /* 개발 환경 차이로인해 사전 환경 경로 지정 */ 
private String macosxbooking = "/Users/nifskorea/Desktop/DB/booking_cus_info.txt";  // 
private String windowsbooking = "C:\\DB\\booking_cus_info.txt";
 private String line ="";  // 파일 공백시 데이터를 채워줌  


SFR100Process fileae = new SFR100Process();
    @Override
    public void fRead() {
        if(fileae.getOssystem() ==1){
       try{
            BufferedReader fileread = new BufferedReader(new FileReader(macosxbooking)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
            readInfo.add(line); // 읽은 정보 기록   
            System.out.println(line);
            System.out.println(readInfo.size());
       }
    }catch (FileNotFoundException e ){
        e.printStackTrace();
    }catch (IOException e) {
            e.printStackTrace();
        }
        }
        else if(fileae.getOssystem() ==2){
             try{
            BufferedReader fileread = new BufferedReader(new FileReader(windowsbooking)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
            readInfo.add(line); // 읽은 정보 기록   
            //System.out.println(line);
       }
    }catch (FileNotFoundException e ){
        e.printStackTrace();
    }catch (IOException e) {
            e.printStackTrace();
        }
            
        }
    }
    @Override
    public void fWrite(String a) throws IOException {
        String oslocation ="";
        
        if(fileae.getOssystem() ==1){
            oslocation  = macosxbooking;
        }
        else if(fileae.getOssystem() ==2){
             oslocation  = windowsbooking;
        }
         BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,false));
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(a+"\n"); // 출력  여유가 된다면 시간기록되게 하는거 한번 고려 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
    }

    @Override
    public void sPlite() {
       
       for(int i =0 ; i < readInfo.size(); i++){
            line = readInfo.get(i);
            System.out.println(line);
            System.out.println(readInfo.size());
            String[] str = line.split("\\|");
           for(int k = 0 ; k<=5; k++){
           //    System.out.println(str[k]);
            }
           guestInfo.add(new CustomerInfor(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8],
                    str[9], str[10], str[11], str[12], str[13], str[14], str[15], str[16]));
           
           /*String chechkNum, String name, String roomNum, String customerNum, String phoneNum, 
            String cInYear, String cInMonth, String cInDay, String cOutYear, String cOutMonth, String cOutDay, 
            String roomPrice, String card, String cardNum, String endMonth, String endYear, String guarantee*/
        }
      
    }
public ArrayList<CustomerInfor> returnGuestInfo() throws IOException {
        return guestInfo;
    }
    

}
