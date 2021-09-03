/**
 * 
 */
package config;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

/**
 * @author akshARA
 *
 */
public class OTPGetter {

	public static final String ACCOUNT_SID = "ACa4d96d2b143d39b2e983a36a2ca1bc80";
	public static final String AUTH_TOKEN = "6b0bfe4440caa7124ddd50fcd4e11bd1";
	public static final String phn="+16822044558";

	public static String getOTP() {

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		String smsBody = getMessage();

		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");

		return OTPNumber;
	}


	public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals(phn)).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}

	private static Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}

}