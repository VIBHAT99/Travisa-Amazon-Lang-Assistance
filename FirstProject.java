import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class FirstProject {
private static Scanner keyboard;
public static void main(String[] args) {
	System.out.println("Hello User!");
keyboard = new Scanner(System.in);
String Hello=null;
Hello=keyboard.nextLine();
System.out.println("Welcome! to the TravisaBot.\nYou will be ensured a 15% off on your first trip, if \nyou agree with the Expedia Privacy Policy for secured access \nto your travel details.");
System.out.println("Do you AGREE!(Yes/No)");
String reply=null;
reply=keyboard.nextLine();
String agree= new String(reply);
if(agree.equalsIgnoreCase("Yes")) {
	System.out.println("What's your 1st preferred language, English / Español\n" + 
			" / Deutsche / français / 中文 / हिंदी / عربى ?");
	String Lang=null;
	Lang=keyboard.nextLine();
	String language= new String (Lang);
	if(language.equalsIgnoreCase("English")) {
		System.out.println("Today we will communicate in English.");
		System.out.println("What's Your Name?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("What's Your Citizenship?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("Thanks! "+Name+" Which country are you going to travel to?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("Wow! Amazing! \n"+country+ " is a beautiful place to have a real travel experience.");
		System.out.println("What city are you planning to travel to in "+country+ " ?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Please provide your Visa number or leave it blank. ");
		System.out.println("REMEMBER!!, your Visa number starts with an uppercase letter");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Please enter your Passport number");
		System.out.println("REMEMBER!!, your Passport number starts with an uppercase letter");
		String Passport;
		Passport=keyboard.nextLine();
		String pnumber= new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Please enter your Passport number by restarting the bot!");
			System.out.println("Please be sure when you enter your\npassport number, which matches the one on your\ncurrent passport.");
			System.out.println("Thank you for choosing Expedia's Personalized Travelling Robot.");
		}
		else {
		System.out.println("Please make sure I got Your Visa & Passport Number correct.\nPassport Number- "+Passport+"\nVisa Number- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Thanks for the info");
		System.out.println("Number of Days you're planning to stay in "+city+" for?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("How much is your budget?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("So let me confirm with you your travel details.\n"+"You're travelling to "+city+", "+country+" for "+days+" days."+"\nAnd you've $"+df.format(money)+" for your trip."+"\nAm I right?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("Ok! We've all your travel details, and we will be connecting \nyou to \nExpedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Here's Your Ticket Number "+ticket);
		System.out.println("Please call within 24 hours at "+"+1(800)-397-3342");
		System.out.println("Thank you for choosing Expedia's Personalized Travelling Robot.");
		}	}

	else if(language.equalsIgnoreCase("中文")){
		System.out.println("今天我们将用中文交流。");
		System.out.println("你叫什么名字？");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("你的公民身份是什么？");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("谢谢！ "+Name+" 你要去哪个国家？");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("哇噢！令人吃惊。\n"+country+ "是一个美丽的地方有一个真正的旅游体验。");
		System.out.println("你打算去哪个城市旅游?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("请提供您的签证号码");
		System.out.println("请记住，您的签证号码以大写字母开头");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("请输入您的护照号码");
		System.out.println("请记住，您的护照号码以大写字母开头");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("请重新启动TravisaBot以输入您的护照号码！");
			System.out.println("请确保您输入的护照号码与当前护照上的护照号码相符。");
			System.out.println("感谢您选择Expedia的个性化旅行机器人");
		}
		else {
		System.out.println("请确保您的签证和护照号码是正确的。\n护照号- "+Passport+"\n签证号码- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("谢谢（你的）信息。");
		System.out.println("你打算留在的天数？");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("你的预算多少钱？");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("所以，让我确认你的旅行细节。\n"+"你前往 "+city+", "+country+" 对于 "+days+" 天。"+"\n你有 $"+money+" 为您的旅行"+"\n我对吗？");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("这是好的！我们有你所有的旅行细节，我们会 \n连接你到 \nExpedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("这是你的连接票号码 "+ticket+"\n请将此编号提交给Expedia客户服务代表");
		System.out.println("请在24小时内打电话"+"+1(800)-397-3342");
		System.out.println("感谢您选择Expedia的个性化旅行机器人");
	}}
	else if(language.equalsIgnoreCase("Chinese")){
		System.out.println("今天我们将用中文交流。");
		System.out.println("你叫什么名字？");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("你的公民身份是什么？");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("谢谢！ "+Name+" 你要去哪个国家？");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("哇噢！令人吃惊。\n"+country+ "是一个美丽的地方有一个真正的旅游体验。");
		System.out.println("你打算去哪个城市旅游?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("请提供您的签证号码");
		System.out.println("请记住，您的签证号码以大写字母开头");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("请输入您的护照号码");
		System.out.println("请记住，您的护照号码以大写字母开头");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber= new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("请重新启动TravisaBot以输入您的护照号码！");
			System.out.println("请确保您输入的护照号码与当前护照上的护照号码相符。");
			System.out.println("感谢您选择Expedia的个性化旅行机器人");
		}
		System.out.println("请确保您的签证和护照号码是正确的。\n护照号- "+Passport+"\n签证号码- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("谢谢（你的）信息。");
		System.out.println("你打算留在的天数？");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("你的预算多少钱？");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("所以，让我确认你的旅行细节。\n"+"你前往 "+city+", "+country+" 对于 "+days+" 天。"+"\n你有 $"+money+" 为您的旅行"+"\n我对吗？");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("这是好的！我们有你所有的旅行细节，我们会 \n连接你到 \nExpedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("这是你的连接票号码 "+ticket+"\n请将此编号提交给Expedia客户服务代表");
		System.out.println("请在24小时内打电话"+"+1(800)-397-3342");
		System.out.println("感谢您选择Expedia的个性化旅行机器人");
	}

	else if(language.equalsIgnoreCase("Español")){
		System.out.println("Hoy nos comunicaremos en español.");
		System.out.println("¿Cuál es tu nombre?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("¿Cuál es tu ciudadanía?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("¡Estupendo! ¿A qué país vas a viajar?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("¡Guauu! Asombroso. \n"+country+ " es un lugar hermoso para tener una experiencia de viaje real.");
		System.out.println("A qué ciudad estás planeando viajar en"+country);
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Por favor ingrese su número de Visa o déjalo en blanco.");
		System.out.println("Recuerde, su número de visa comienza con una letra mayúscula.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Por favor ingrese su número de pasaporte.");
		System.out.println("Recuerde, su número de pasaporte comienza con una letra mayúscula.");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Por favor ingrese su número de pasaporte reiniciando el bot.");
			System.out.println("Asegúrese de ingresar su número de pasaporte,\nque coincide con el de su pasaporte actual.");
			System.out.println("Gracias por elegir Travel Bot personalizado de Expedia.");
		}
		else {
		System.out.println("Por favor, asegúrese de que tengo su número de visa y pasaporte correcto.\n" + 
				"Número de pasaporte- "+Passport+"\nNúmero de visa- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Gracias por la info");
		System.out.println("¿Cuántos días planeas quedarte en "+city+ "?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("¿Cuánto es tu presupuesto?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("Así que déjenme confirmar con ustedes sus detalles de viaje.\n"+"Estás viajando a "+city+", "+country+" para "+days+" dias."+"\nY tienes $"+money+" para tu viaje. "+"\n¿Estoy en lo cierto?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("¡De acuerdo! Tenemos todos sus detalles de viaje, y nos estaremos conectando \nusted a \nExpedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Aquí está su número de boleto\n"+ticket);
		System.out.println("Por favor llame dentro de las 24 horas a\n"+"+1(800)-397-3342");
		System.out.println("Gracias por elegir Travel Bot personalizado de Expedia.");
	}}
	else if(language.equalsIgnoreCase("Spanish")){
		System.out.println("Hoy nos comunicaremos en español.");
		System.out.println("¿Cuál es tu nombre?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("¿Cuál es tu ciudadanía?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("¡Estupendo! ¿A qué país vas a viajar?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("¡Guauu! Asombroso. \n"+country+ " es un lugar hermoso para tener una experiencia de viaje real.");
		System.out.println("A qué ciudad estás planeando viajar en"+country);
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Por favor ingrese su número de Visa o déjalo en blanco.");
		System.out.println("Recuerde, su número de visa comienza con una letra mayúscula.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Por favor ingrese su número de pasaporte.");
		System.out.println("Recuerde, su número de pasaporte comienza con una letra mayúscula.");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String (Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Por favor ingrese su número de pasaporte reiniciando el bot.");
			System.out.println("Asegúrese de ingresar su número de pasaporte,\nque coincide con el de su pasaporte actual.");
			System.out.println("Gracias por elegir Travel Bot personalizado de Expedia.");
		}
		else {
		System.out.println("Por favor, asegúrese de que tengo su número de visa y pasaporte correcto.\n" + 
				"Número de pasaporte- "+Passport+"\nNúmero de visa- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Gracias por la info");
		System.out.println("¿Cuántos días planeas quedarte en "+city+ "?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("¿Cuánto es tu presupuesto?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("Así que déjenme confirmar con ustedes sus detalles de viaje.\n"+"Estás viajando a "+city+", "+country+" para "+days+" dias."+"\nY tienes $"+money+" para tu viaje. "+"\n¿Estoy en lo cierto?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("¡De acuerdo! Tenemos todos sus detalles de viaje, y nos estaremos conectando \nusted a \nExpedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Aquí está su número de boleto\n"+ticket);
		System.out.println("Por favor llame dentro de las 24 horas a\n"+"+1(800)-397-3342");
		System.out.println("Gracias por elegir Travel Bot personalizado de Expedia.");
	}}
	
	else if(language.equalsIgnoreCase("français")){
		System.out.println("Aujourd'hui, nous communiquerons en français.");
		System.out.println("Quel est ton nom?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("Quelle est votre citoyenneté?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("Formidable! Dans quel pays allez-vous voyager?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("Ouah! Incroyable \n"+country+ " est un endroit agréable pour avoir une vraie expérience de voyage.");
		System.out.println("Dans quelle ville envisagez-vous de voyager?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Veuillez indiquer votre numéro de visa ou laissez-le vide.");
		System.out.println("RAPPELEZ-VOUS !!, votre numéro de visa commence par une lettre majuscule.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Veuillez entrer votre numéro de passeport.");
		System.out.println("RAPPELEZ-VOUS !!, votre numéro de passeport commence par une lettre majuscule.");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Veuillez entrer votre numéro de passeport en redémarrant le bot!");
			System.out.println("S'il vous plaît assurez-vous que lorsque vous\nentrez votre numéro de passeport,\nil correspond à celui de votre passeport actuel.");
			System.out.println("Merci d'avoir choisi le Personalized Traveling Bot d'Expedia.");
		}
		else {
		System.out.println("S'il vous plaît assurez-vous que j'ai obtenu votre \nnuméro de visa et de passeport correct.\nNuméro de passeport- "+Passport+"\nNuméro de visa-" + Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Merci pour l'info.");
		System.out.println("Nombre de jours que vous prévoyez de rester en "+city+"?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("De combien est ton budget?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("Alors laissez-moi confirmer avec vous les détails de votre voyage.\n"+"Vous voyagez à "+city+", "+country+" pour "+days+" journées."+"\nEt vous avez $"+money+" pour votre voyage. "+"\nAi-je raison?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("D'accord! Nous avons tous vos détails de voyage, et nous nous connecterons\nyou to Expedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Voici votre numéro de billet "+ticket);
		System.out.println("S'il vous plaît appelez dans les 24 heures à "+"\n+1(800)-397-3342");
		System.out.println("Merci d'avoir choisi le Personalized Traveling Bot d'Expedia.");

	}}
	else if(language.equalsIgnoreCase("French")){
		System.out.println("Aujourd'hui, nous communiquerons en français.");
		System.out.println("Quel est ton nom?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("Quelle est votre citoyenneté?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("Formidable! Dans quel pays allez-vous voyager?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("Ouah! Incroyable \n"+country+ " est un endroit agréable pour avoir une vraie expérience de voyage.");
		System.out.println("Dans quelle ville envisagez-vous de voyager?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Veuillez indiquer votre numéro de visa ou laissez-le vide.");
		System.out.println("RAPPELEZ-VOUS !!, votre numéro de visa commence par une lettre majuscule.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Veuillez entrer votre numéro de passeport.");
		System.out.println("RAPPELEZ-VOUS !!, votre numéro de passeport commence par une lettre majuscule.");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Veuillez entrer votre numéro de passeport en redémarrant le bot!");
			System.out.println("S'il vous plaît assurez-vous que lorsque vous\nentrez votre numéro de passeport,\nil correspond à celui de votre passeport actuel.");
			System.out.println("Merci d'avoir choisi le Personalized Traveling Bot d'Expedia.");

		}
		else {
		System.out.println("S'il vous plaît assurez-vous que j'ai obtenu votre \nnuméro de visa et de passeport correct.\nNuméro de passeport- "+Passport+"\nNuméro de visa-" + Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Merci pour l'info.");
		System.out.println("Nombre de jours que vous prévoyez de rester en "+city+"?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("De combien est ton budget?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("Alors laissez-moi confirmer avec vous les détails de votre voyage.\n"+"Vous voyagez à "+city+", "+country+" pour "+days+" journées."+"\nEt vous avez $"+money+" pour votre voyage. "+"\nAi-je raison?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("D'accord! Nous avons tous vos détails de voyage, et nous nous connecterons\nyou to Expedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Voici votre numéro de billet "+ticket);
		System.out.println("S'il vous plaît appelez dans les 24 heures à "+"\n+1(800)-397-3342");
		System.out.println("Merci d'avoir choisi le Personalized Traveling Bot d'Expedia.");
		}}
	
	else if(language.equalsIgnoreCase("हिंदी")){
		System.out.println("आज हम हिंदी में संवाद करेंगे।");
		System.out.println("आपका नाम क्या है?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("आपकी नागरिकता क्या है?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("वाह! आप किस देश की यात्रा करने जा रहे हैं?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("अरे वाह! आश्चर्यजनक।\n"+country+ " एक वास्तविक यात्रा अनुभव के लिए एक सुंदर जगह है।");
		System.out.println("आप किस शहर की यात्रा करने की योजना बना रहे हैं?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("कृपया अपना वीज़ा नंबर दें या इसे खाली छोड़ दें।");
		System.out.println("याद रखें !!, आपका वीज़ा नंबर एक अपरकेस अक्षर से शुरू होता है");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("कृपया अपना पासपोर्ट नंबर दर्ज करें ");
		System.out.println("याद रखें !!, आपका पासपोर्ट नंबर एक अपरकेस अक्षर से शुरू होता है।");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("कृपया रोबोट को पुनरारंभ करके अपना पासपोर्ट नंबर दर्ज करें!");
			System.out.println("कृपया सुनिश्चित करें कि जब आप अपना पासपोर्ट नंबर दर्ज करते हैं,\nतो वह आपके वर्तमान पासपोर्ट से मेल खाता है।");
			System.out.println("एक्सपीडिया के निजीकृत यात्रा बॉट को चुनने के लिए धन्यवाद।");
		}
		else {
		System.out.println("कृपया सुनिश्चित करें कि मुझे आपका वीज़ा और पासपोर्ट नंबर सही मिल गया है।\nपासपोर्ट नंबर- "+Passport+"\nवीज़ा नंबर- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("जानकारी के लिए धन्यवाद।");
		System.out.println("उन दिनों की संख्या जिसे आप " +city+ " में रहने की योजना बना रहे हैं?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("आपका बजट कितना है?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("तो मुझे आपके यात्रा विवरण की पुष्टि करें।\n"+"आप "+city+", "+country+ " की यात्रा करना चाहते हैं, और आप "+days+" दिनों के लिए यात्रा करने जा रहे हैं"+"\nऔर आपके पास $"+money+" हैं"+"\nक्या मैं सही हू?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("ठीक है! हमारे पास आपके सभी यात्रा विवरण हैं, \nऔर हम आपको हम आपको एक्सीडिया से कनेक्ट करेंगे");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("यह आपकी टिकट संख्या है"+ticket);
		System.out.println("कृपया 24 घंटे के भीतर कॉल करें "+"+1(800)-397-3342");
		System.out.println("एक्सपीडिया के निजीकृत यात्रा बॉट को चुनने के लिए धन्यवाद।");

	}}
	else if(language.equalsIgnoreCase("Hindi")){
		System.out.println("आज हम हिंदी में संवाद करेंगे।");
		System.out.println("आपका नाम क्या है?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("आपकी नागरिकता क्या है?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("वाह! आप किस देश की यात्रा करने जा रहे हैं?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("अरे वाह! आश्चर्यजनक।\n"+country+ " एक वास्तविक यात्रा अनुभव के लिए एक सुंदर जगह है।");
		System.out.println("आप किस शहर की यात्रा करने की योजना बना रहे हैं?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("कृपया अपना वीज़ा नंबर दें या इसे खाली छोड़ दें।");
		System.out.println("याद रखें !!, आपका वीज़ा नंबर एक अपरकेस अक्षर से शुरू होता है");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("कृपया अपना पासपोर्ट नंबर दर्ज करें ");
		System.out.println("याद रखें !!, आपका पासपोर्ट नंबर एक अपरकेस अक्षर से शुरू होता है।");
		String Passport=null;
		Passport=keyboard.nextLine();
	    String pnumber=new String(Passport);
	    if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("कृपया रोबोट को पुनरारंभ करके अपना पासपोर्ट नंबर दर्ज करें!");
			System.out.println("कृपया सुनिश्चित करें कि जब आप अपना पासपोर्ट नंबर दर्ज करते हैं,\nतो वह आपके वर्तमान पासपोर्ट से मेल खाता है।");
			System.out.println("एक्सपीडिया के निजीकृत यात्रा बॉट को चुनने के लिए धन्यवाद।");
		}
	    else {
	    	System.out.println("कृपया सुनिश्चित करें कि मुझे आपका वीज़ा और पासपोर्ट नंबर सही मिल गया है।\nपासपोर्ट नंबर- "+Passport+"\nवीज़ा नंबर- "+Visa);
			String yup=null;
			yup=keyboard.nextLine();
			System.out.println("जानकारी के लिए धन्यवाद।");
			System.out.println("उन दिनों की संख्या जिसे आप " +city+ " में रहने की योजना बना रहे हैं?");
			int days=0;
			days=keyboard.nextInt();
			System.out.println("आपका बजट कितना है?");
			double money;
			money=keyboard.nextDouble();
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(money));
			System.out.println("तो मुझे आपके यात्रा विवरण की पुष्टि करें।\n"+"आप "+city+", "+country+ " की यात्रा करना चाहते हैं, और आप "+days+" दिनों के लिए यात्रा करने जा रहे हैं"+"\nऔर आपके पास $"+money+" हैं"+"\nक्या मैं सही हू?");
		    yup=keyboard.nextLine();
			String yes=null;
			yes=keyboard.nextLine();
			System.out.println("ठीक है! हमारे पास आपके सभी यात्रा विवरण हैं, \nऔर हम आपको हम आपको एक्सीडिया से कनेक्ट करेंगे");
			int ticket=(int)(Math.random()*100000000);
			System.out.println("यह आपकी टिकट संख्या है"+ticket);
			System.out.println("कृपया 24 घंटे के भीतर कॉल करें "+"+1(800)-397-3342");
			System.out.println("एक्सपीडिया के निजीकृत यात्रा बॉट को चुनने के लिए धन्यवाद।");

	}}

	else if(language.equalsIgnoreCase("عربى")){
		System.out.println("اليوم سوف نتواصل باللغة العربية.");
		System.out.println("ما اسمك؟");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("ما هي جنسيتك؟");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("عظيم! ما البلد الذي سوف تسافر إليه؟");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("رائع. \n"+country+ " هو مكان جميل أن يكون تجربة السفر الحقيقية.");
		System.out.println("ما المدينة التي تخطط للسفر إليها؟ "+country);
		String city=null;
		city=keyboard.nextLine();
		System.out.println("يرجى إعطاء رقم التأشيرة أو تركه فارغا.");
		System.out.println("تذكر!! يبدأ رقم التأشيرة بحرف كبير.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("الرجاء إدخال رقم جواز سفرك.");
		System.out.println("تذكر!! يبدأ رقم جواز السفر بالحرف الكبير.");
		String Passport=null;
		Passport=keyboard.nextLine();
		String pnumber=new String(Passport);
		if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("الرجاء إدخال رقم جواز السفر الخاص بك عن طريق إعادة تشغيل بوت!");
			System.out.println("يرجى التأكد عند إدخال رقم جواز السفر الخاص بك، فإنه يطابق واحد على جواز السفر الحالي.");
			System.out.println("شكرا لاختيارك إكسبيديا مخصص السفر بوت.");
		}
		else {
		System.out.println("يرجى التأكد من أنني حصلت على رقم جواز السفر الصحيح ورقم التأشيرة.\nرقم جواز السفر- "+Passport+"\nرقم الفيزا- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("شكرا للمعلومة");
		System.out.println("عدد الأيام التي تخطط للبقاء فيها"+city+" ?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("كم هي ميزانيتك؟");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("لذلك اسمحوا لي أن أؤكد معك تفاصيل السفر الخاصة بك.\n"+"لذلك كنت السفر إلى "+city+", "+country+" البقاء ل "+days+" أيام."+"\nوكنت قد $"+money+" لرحلتك "+"\nهل انا على حق؟");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("حسنا! لدينا كل ما تبذلونه من تفاصيل السفر، ونحن سوف يكون ربط لك ل Expedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("إليك رقم التذكرة "+ticket);
		System.out.println("يرجى الاتصال في غضون 24 ساعة في "+"+1(800)-397-3342");
		System.out.println("شكرا لاختيارك إكسبيديا مخصص السفر بوت.");

	}}
	else if(language.equalsIgnoreCase("Arabic")){
		System.out.println("اليوم سوف نتواصل باللغة العربية.");
		System.out.println("ما اسمك؟");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("ما هي جنسيتك؟");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("عظيم! ما البلد الذي سوف تسافر إليه؟");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("رائع. \n"+country+ " هو مكان جميل أن يكون تجربة السفر الحقيقية.");
		System.out.println("ما المدينة التي تخطط للسفر إليها؟ "+country);
		String city=null;
		city=keyboard.nextLine();
		System.out.println("يرجى تقديم رقم التأشيرة أو تركه فارغا.");
		System.out.println("تذكر!، يبدأ رقم التأشيرة بحرف كبير.");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("الرجاء إدخال رقم جواز السفر");
		System.out.println("تذكر!، يبدأ رقم جواز السفر بحرف كبير");
		String Passport=null;
		Passport=keyboard.nextLine();
	String pnumber=new String(Passport);
	if(pnumber.equalsIgnoreCase("")) {
		System.out.println("الرجاء إدخال رقم جواز السفر الخاص بك عن طريق إعادة تشغيل بوت!");
		System.out.println("يرجى التأكد عند إدخال رقم جواز السفر الخاص بك، فإنه يطابق واحد على جواز السفر الحالي.");
		System.out.println("شكرا لاختيارك إكسبيديا مخصص السفر بوت.");
	}
	else {
		System.out.println("يرجى التأكد من أنني حصلت على رقم جواز السفر الصحيح ورقم التأشيرة.\nرقم جواز السفر- "+Passport+"\nرقم الفيزا- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("شكرا للمعلومة");
		System.out.println("عدد الأيام التي تخطط للبقاء فيها"+city+" ?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("كم هي ميزانيتك؟");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("لذلك اسمحوا لي أن أؤكد معك تفاصيل السفر الخاصة بك.\n"+"لذلك كنت السفر إلى "+city+", "+country+" البقاء ل "+days+" أيام."+"\nوكنت قد $"+money+" لرحلتك "+"\nهل انا على حق؟");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("حسنا! لدينا كل ما تبذلونه من تفاصيل السفر، ونحن سوف يكون ربط لك ل Expedia.com");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("إليك رقم التذكرة "+ticket);
		System.out.println("يرجى الاتصال في غضون 24 ساعة في "+"+1(800)-397-3342");
		System.out.println("شكرا لاختيارك إكسبيديا مخصص السفر بوت.");

	}}

	else {
		System.out.println("Heute werden wir auf Deutsch kommunizieren.");
		System.out.println("Wie heißen Sie?");
		String Name=null;
		Name=keyboard.nextLine();
		System.out.println("Was ist deine Nationalität?");
		String citizen=null;
		citizen=keyboard.nextLine();
		System.out.println("Beeindruckend! In welches Land gehst du?");
		String country=null;
		country=keyboard.nextLine();
		System.out.println("Beeindruckend! Tolle!\n"+country+ " ist ein schöner Ort, um eine echte Reiseerfahrung zu haben.");
		System.out.println("In welche Stadt möchten Sie reisen "+country+ " ?");
		String city=null;
		city=keyboard.nextLine();
		System.out.println("Bitte geben Sie Ihre Visa Nummer ein oder lassen Sie sie leer.");
		System.out.println("MERKEN! Ihre Visumsnummer beginnt mit einem Großbuchstaben");
		String Visa=null;
		Visa=keyboard.nextLine();
		System.out.println("Bitte geben Sie Ihre Reisepassnummer ein.");
		System.out.println("MERKEN! Ihre Passnummer beginnt mit einem Großbuchstaben.");
		String Passport=null;
		Passport=keyboard.nextLine();
	    String pnumber=new String(Passport);
	    if(pnumber.equalsIgnoreCase("\n")) {
			System.out.println("Bitte geben Sie Ihre Passport-Nummer ein,\nindem Sie den Bot neu starten!");
			System.out.println("Bitte achten Sie darauf, Ihre Passnummer einzugeben\ndie Ihrer aktuellen Passnummer entspricht.");
			System.out.println("Vielen Dank, dass Sie sich für\nExpedia Custom Travel Bot entschieden haben.");
		}
	    else {
		System.out.println("Bitte stellen Sie sicher, dass ich Ihre\nVisa & Passport-Nummer richtig gelesen habe.\nAusweisnummer-"+Passport+"\nVisumnummer- "+Visa);
		String yup=null;
		yup=keyboard.nextLine();
		System.out.println("Danke für die Information.");
		System.out.println("Anzahl der Tage, an denen Sie in "+city+ " bleiben möchten?");
		int days=0;
		days=keyboard.nextInt();
		System.out.println("Wie hoch ist Ihr Budget?");
		double money;
		money=keyboard.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(money));
		System.out.println("Lassen Sie mich Ihre Reisedetails bestätigen.\n"+"Du reist nach "+city+", "+country+" Für "+days+" tage."+"\nUnd du hast $"+money+" für deine Reise."+"\nHabe ich recht?");
	    yup=keyboard.nextLine();
		String yes=null;
		yes=keyboard.nextLine();
		System.out.println("OK! Wir haben alle Ihre Reisedaten\nund wir werden Sie mit Expedia.com verbinden");
		int ticket=(int)(Math.random()*100000000);
		System.out.println("Hier ist Ihre Ticketnummer "+ticket);
		System.out.println("Bitte rufen Sie innerhalb von 24 Stunden bei "+"+1(800)-397-3342");
		System.out.println("Vielen Dank, dass Sie sich für Expedia's Travelling Bot entschieden haben.");

	}}
}
else {System.out.println("Thank You! \nFor visiting Expedia's Personalised Travelling Bot." );
System.out.println("Travel Safe and Sound!");
	
}
}

}




