package funstuff;

import java.util.Date;
import java.util.regex.Pattern;



public class Person {
	private String name;
	private String e_mail;
	private Date birthday;
	private char gender;
	
	
	
	
	/**
	 * Sets the name if valid to the object in the Person class
	 * @param name is the first and last name of person
	 */
	public void setName(String name){
		// TODO: set name if valid 
		if (! isValidName(name)){
			throw new IllegalArgumentException( "This name is not valid");
		}
		this.name = name;
	}
	
	/**
	 * Set the e-mail if valid to the object in the Person class
	 * @param e_mail is the e_mail
	 */
	public void setEmail(String e_mail){
		// TODO: set e_mail if valid
		if (! isValidEmail(e_mail)){
			throw new IllegalArgumentException("this e-mail is not valid");
		}
		this.e_mail = e_mail;
	}
	/**
	 * Set a valid birthday to the object in the Person class
	 * @param birthday is the birthday
	 */
	public void setBirthday(Date birthday){
		// TODO: set the birthday if valid
		if (! isValidBirthday(birthday)){
			throw new IllegalArgumentException("this date is in the future");
		}
		this.birthday = birthday;
	}
	/**
	 * Set the gender to the object in the Person class
	 * @param gender is the gender 
	 */
	public void setGender(char gender){
		// TODO: set the gender
		if (! isValidGender(gender)){
			throw new IllegalArgumentException("This is not a gender type");
		}
		this.gender = gender;
	}
	/**
	 * Check if the gender is a valid type
	 * @param gender2 is the gender
	 * @return True if valid
	 */
	private boolean isValidGender(char gender2) {
		// TODO Check if gender is valid
		if (gender2 == 'M' || gender2 == 'F' || gender2 == '\0'){
			return true;
		}
				
		return false;
	}

	/**
	 * returns the name of the object in the Person class.
	 * @return the first and last name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * return the E-mail
	 * @return
	 */
	public String getEmail(){
		return this.e_mail;		
	}
	/**
	 * returns the birthday of person object
	 * @return
	 */
	public Date getBirthday(){
		return this.birthday;
	}
	/**
	 * Get the gender
	 * @return the gender
	 */
	public char getGender(){
		return this.gender;
	}
	/**
	 * Check if the name is valid
	 * @param name the name of the person
	 * @return true if name is valid
	 */
	private boolean isValidName(String name){
		String name1[] = name.split(" ");
		if (name1[0].matches("[a-zA-Z]+") && name1.length == 2 && name1[1].matches("[a-zA-Z]+")  && name1[0].length() > 1 && name1[1].length() > 1){
			return true;
		}
		return false;
	}
	/**
	 * Check if the birthday is valid
	 * @param birthday is the birthday
	 * @return true if birthday is valid
	 */
	private boolean isValidBirthday(Date birthday){
		long today = new Date().getTime();
		Date today1 = new Date(today);
		if (today1.after(birthday)){
			return true;
		}
		//TODO return true if date is valid
		return false;
	}
	
	/**
	 * checks if the e-mail corresponds to the name and format
	 * firstName.lastName@domain.landcode
	 * @param e_mail is the input e-mail
	 * @return true if e-mail is valid
	 */
	private boolean isValidEmail(String e_mail){
		if (! e_mail.contains("@")){
			return false;
		}
		String fname = e_mail.substring(0, e_mail.indexOf("."));
		String lname = e_mail.substring(e_mail.indexOf(".")+1, e_mail.indexOf("@"));
		String landcode = e_mail.substring(e_mail.length()-2);
		System.out.println(landcode);

		
		
		System.out.println(this.name +" " + fname + " " + lname + " " + landcode);
		if ((fname + " " + lname).contentEquals(this.name.toLowerCase()) && landcode.contentEquals("no")){
			return true;
		}
		return false;
	}
	
	private String landskode = "ad ae af ag ai,  al ,  am ,  ao ,  aq ,  ar ,  as ,  at ,  au ,  aw ,  ax ,  az ,  ba ,  bb ,  bd ,  be ,  bf ,  bg ,  bh ,  bi ,  bj ,  bl ,  bm ,  bn ,  bo ,  bq ,  br ,  bs ,  bt ,  bv ,  bw ,  by ,  bz ,  ca ,  cc ,  cd ,  cf ,  cg ,  ch ,  ci ,  ck ,  cl ,  cm ,  cn ,  co ,  cr ,  cu ,  cv ,  cw ,  cx ,  cy ,  cz ,  de ,  dj ,  dk ,  dm ,  do ,  dz ,  ec ,  ee ,  eg ,  eh ,  er ,  es ,  et ,  fi ,  fj ,  fk ,  fm ,  fo ,  fr ,  ga ,  gb ,  gd ,  ge ,  gf ,  gg ,  gh ,  gi ,  gl ,  gm ,  gn ,  gp ,  gq ,  gr ,  gs ,  gt ,  gu ,  gw ,  gy ,  hk ,  hm ,  hn ,  hr ,  ht ,  hu ,  id ,  ie ,  il ,  im ,  in ,  io ,  iq ,  ir ,  is ,  it ,  je ,  jm ,  jo ,  jp ,  ke ,  kg ,  kh ,  ki ,  km ,  kn ,  kp ,  kr ,  kw ,  ky ,  kz ,  la ,  lb ,  lc ,  li ,  lk ,  lr ,  ls ,  lt ,  lu ,  lv ,  ly ,  ma ,  mc ,  md ,  me ,  mf ,  mg ,  mh ,  mk ,  ml ,  mm ,  mn ,  mo ,  mp ,  mq ,  mr ,  ms ,  mt ,  mu ,  mv ,  mw ,  mx ,  my ,  mz ,  na ,  nc ,  ne ,  nf ,  ng ,  ni ,  nl ,  no ,  np ,  nr ,  nu ,  nz ,  om ,  pa ,  pe ,  pf ,  pg ,  ph ,  pk ,  pl ,  pm ,  pn ,  pr ,  ps ,  pt ,  pw ,  py ,  qa ,  re ,  ro ,  rs ,  ru ,  rw ,  sa ,  sb ,  sc ,  sd ,  se ,  sg ,  sh ,  si ,  sj ,  sk ,  sl ,  sm ,  sn ,  so ,  sr ,  ss ,  st ,  sv ,  sx ,  sy ,  sz ,  tc ,  td ,  tf ,  tg ,  th ,  tj ,  tk ,  tl ,  tm ,  tn ,  to ,  tr ,  tt ,  tv ,  tw ,  tz ,  ua ,  ug ,  um ,  us ,  uy ,  uz ,  va ,  vc ,  ve ,  vg ,  vi ,  vn ,  vu ,  wf ,  ws ,  ye ,  yt ,  za ,  zm ,  zw";
	
	

	
	
	

}
