package cn.com.webxml;

/**
 * �����ֻ���������ز�ѯWEB����
 * @Name  : PhoneClientTest
 * @Author : LH
 * @Date : 2018��5��12�� ����4:47:05
 * @Version : V1.0
 * 
 * @Description : �ͻ��˱��뷽ʽ����(�ֻ����������)web service
 */
public class PhoneClientTest {

	public static void main(String[] args) {
         MobileCodeWS factory = new MobileCodeWS();
         MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
         String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("18321147664", null);
         System.out.println("���룺 " +mobileCodeInfo);
	}

}
