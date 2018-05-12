package cn.com.webxml;

/**
 * 国内手机号码归属地查询WEB服务
 * @Name  : PhoneClientTest
 * @Author : LH
 * @Date : 2018年5月12日 下午4:47:05
 * @Version : V1.0
 * 
 * @Description : 客户端编码方式访问(手机号码归属地)web service
 */
public class PhoneClientTest {

	public static void main(String[] args) {
         MobileCodeWS factory = new MobileCodeWS();
         MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
         String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("18321147664", null);
         System.out.println("号码： " +mobileCodeInfo);
	}

}
