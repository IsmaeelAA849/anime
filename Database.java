package anime;

import java.util.ArrayList;

public class Database {
	public ArrayList<String> previousWords= new ArrayList<String>();
	public ArrayList<Individual>database;
	public ArrayList<Individual>justDeleted;
	PropertyList properties;
	
	public Database() {

		properties = new PropertyList();
		
		justDeleted = new ArrayList<Individual>();
		database = new ArrayList<Individual>();
		
		addCharacters();
	}
	
	public void addCharacters() {

		addLuffy();
		addNami();
		addZoro();
		addSanji();
		addUsopp();
		addNaruto();
		addSasuke();
		addSakura();
		addIchigo();
		addAizen();
		addOrochimaru();
		addKakashi();
		addTsunade();
		addJiraiya();
		addDeku();
		addBakugo();
		addTodoroki();
		addAllMight();
		addShigaraki();
		addAllForOne();
		addItadori();
		addMegumi();
		addNobara();
		addGojo();
		addMahito();
		addGetou();
		addSukuna();
		addGon();
		addKillua();
		addMereum();
		addLelouch();
		addItachi();
		addHinata();
		addAsta();
		addBoa();
		addMeliodas();
		addShikamaru();
		addNezuko();
		addKurapika();
		addUlquiorra();
		addRenji();
		addShanks();
		addLaw();
		addTanjiro();
		addZenitsu();
		addMuzan();
		addNoelle();
		addYuno();
	}
	public void addLuffy() {



		Individual a = new Individual("Luffy","https://tinyurl.com/3a45dt3e");
		String[] these = {"One Piece", "Protagonist", "Black Hair","Brown Eyes","Younger Brother","Pirate", "Devil Fruit User"};
		change(a,these);
		database.add(a);	
	}
	public void addNami() {

		Individual a = new Individual("Nami","https://tinyurl.com/56c9shwk");
		String[] these = {"One Piece", "Female", "Orange Hair","Brown Eyes","Pirate","Younger Sister"};
		change(a,these);
		database.add(a);
	}
	public void addZoro() {

		Individual a = new Individual("Zoro","https://tinyurl.com/j3dh7btt");
		String[] these = {"One Piece", "Green Hair","Brown Eyes","Pirate"};
		change(a,these);
		database.add(a);
	}
	public void addSanji() {
		Individual a = new Individual("Sanji","https://tinyurl.com/nnxcw4z5");
		String[] these = {"One Piece", "Yellow Hair","Younger Brother","Pirate"};
		change(a,these);
		database.add(a);
	}
	public void addUsopp() {
		Individual a = new Individual("Usopp","https://tinyurl.com/2n76xh6b");
		String[] these = {"One Piece", "Black Hair","Pirate"};
		change(a,these);
		database.add(a);
	}
	public void addNaruto() {
		Individual a = new Individual("Naruto","https://tinyurl.com/v32mze75");
		String[] these = {"Naruto","Yellow Hair","Protagonist","Blue Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addSasuke() {

		Individual a = new Individual("Sasuke","https://tinyurl.com/y94vvzhf");
		String[] these = {"Naruto", "Black Hair", "Eye Powers", "Black Eyes","Younger Brother"};
		change(a,these);
		database.add(a);
	}
	public void addSakura() {
		Individual a = new Individual("Sakura","https://tinyurl.com/9wzarnub");
		String[] these = {"Naruto", "Female", "Pink Hair","Green Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addIchigo() {

		Individual a = new Individual("Ichigo","https://tinyurl.com/yhf3vucp");
		String[] these = {"Bleach", "Protagonist", "Orange Hair","Brown Eyes","Older Brother"};
		change(a,these);
		database.add(a);
	}	
	public void addAizen() {
		Individual a = new Individual("Aizen","https://tinyurl.com/2rpwnecb");
		String[] these = {"Bleach", "Villain","Brown Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addOrochimaru() {
		Individual a = new Individual("Orochimaru","https://tinyurl.com/23zfz8ty");
		String[] these = {"Naruto", "Black Hair", "Villain", "Sannin","Golden Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addKakashi() {

		Individual a = new Individual("Kakashi","https://tinyurl.com/39f6sh5r");
		String[] these = {"Naruto", "White Hair", "Sensei","Eye Powers","Black Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addTsunade() {

		Individual a = new Individual("Tsunade","https://tinyurl.com/yydc6tdp");
		String[] these = {"Naruto", "Yellow Hair","Female","Sannin","Brown Eyes",
				"Older Sister"};
		change(a,these);
		database.add(a);
	}
	public void addJiraiya() {
		Individual a = new Individual("Jiraiya","https://tinyurl.com/fzd5j37k");
		String[] these = {"Naruto", "White Hair","Sannin","Black Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addDeku() {
		Individual a = new Individual("Deku","https://tinyurl.com/37v9abwh");
		String[] these = {"My Hero Academia", "Green Hair", "Protagonist","Green Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addBakugo() {
		Individual a = new Individual("Bakugo","https://tinyurl.com/84f3uevw");
		String[] these = {"My Hero Academia", "Yellow Hair","Red Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addTodoroki() {

		Individual a = new Individual("Todoroki","https://tinyurl.com/f87b4wdj");
		String[] these = {"My Hero Academia", "Red Hair","White Hair","naturally different colored eyes",
				"Younger Brother"};
		change(a,these);
		database.add(a);
	}
	public void addAllMight() {

		Individual a = new Individual("All Might","https://tinyurl.com/fbnrfc5w");
		String[] these = {"My Hero Academia", "Yellow Hair", "Sensei","Blue Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addShigaraki() {
		Individual a = new Individual("Shigaraki","https://tinyurl.com/ndr5s243");
		String[] these = {"My Hero Academia", "Villain", "White Hair","Red Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addAllForOne() {
		Individual a = new Individual("All For One","https://tinyurl.com/3umc4k7m");
		String[] these = {"My Hero Academia", "Villain", "White Hair","No Hair","Red Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addItadori() {

		Individual a = new Individual("Itadori","https://tinyurl.com/2h7j8m3r");
		String[] these = {"Jujutsu Kaisen", "Protagonist","Pink Hair","Black Hair","Brown Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addMegumi() {

		Individual a = new Individual("Megumi","https://tinyurl.com/s76cb4df");
		String[] these = {"Jujutsu Kaisen", "Black Hair","Younger Brother","Use Shadows"};
		change(a,these);
		String[]these2 = {"Green Eyes", "Blue Eyes"};
		unknown(a,these2);
		database.add(a);
	}
	public void addNobara() {
		Individual a = new Individual("Nobara","https://tinyurl.com/d7er2uc3");
		String[] these = {"Jujutsu Kaisen", "Female", "Orange Hair"};
		change(a,these);
		database.add(a);
	}
	public void addGojo() {

		Individual a = new Individual("Gojo","https://tinyurl.com/7maahuup");
		String[] these = {"Jujutsu Kaisen", "Sensei", "White Hair", "Eye Powers","Blue Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addMahito() {


		Individual a = new Individual("Mahito","https://tinyurl.com/49rpcku7");
		String[] these = {"Jujutsu Kaisen", "Villain", "Curse","naturally different colored eyes","Gray Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addGetou() {

		Individual a = new Individual("Getou","https://tinyurl.com/busbzdkh");
		String[] these = {"Jujutsu Kaisen", "Villain", "Black Hair","Black Eyes"};
		change(a,these);
		database.add(a);
	}	
	public void addSukuna() {


		Individual a = new Individual("Sukuna","https://tinyurl.com/3mtukmja");
		String[] these = {"Jujutsu Kaisen", "Villain", "Pink Hair", "Curse","Brown Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addGon() {

		Individual a = new Individual("Gon","https://tinyurl.com/b549mc5e");
		String[] these = {"Hunter x Hunter","Protagonist","Green Hair","Brown Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addKillua() {


		Individual a = new Individual("Killua","https://tinyurl.com/3b2zv2mh");
		String[] these = {"Hunter x Hunter","White Hair","Blue Eyes","Older Brother","Younger Brother"};
		change(a,these);
		database.add(a);
	}
	public void addMereum() {

		Individual a = new Individual("Mereum","https://tinyurl.com/ydp2tjes");
		String[] these = {"Hunter x Hunter","Villain","No Hair","Violet Eyes"};
		change(a,these);
		database.add(a);
	}
	public void addLelouch() {


		Individual a = new Individual("Lelouch","https://tinyurl.com/34ukwemc");
		String[] these = {"Code Geass","Protagonist","Black Hair", "Eye Powers","Violet Eyes",
				"Older Brother"};
		change(a,these);
		database.add(a);
	}
	public void addItachi() {
		Individual a = new Individual("Itachi","https://tinyurl.com/5pv6bexb");
		String[] these = {"Naruto","Villain","Black Hair", "Eye Powers","Black Eyes",
				"Older Brother"};
		change(a,these);
		database.add(a);
	}
	public void addHinata() {
		Individual a = new Individual("Hinata Hyuga","https://tinyurl.com/ywet7zw7");
		String[] these = {"Naruto","Female","Blue Hair", "Eye Powers","White Eyes",
				"Older Sister"};
		change(a,these);
		database.add(a);
	}
	public void addAsta() {
		Individual a = new Individual("Asta","https://tinyurl.com/j65pbz8n");
		String[] these = {"Black Clover","Gray Hair", "Protagonist","Green Eyes",
				};
		change(a,these);
		database.add(a);
	}
	public void addBoa() {
		Individual a = new Individual("Boa Hancock","https://tinyurl.com/bkdk2rrm");
		String[] these = {"One Piece","Female", "Pirate","Black Hair", "Blue Eyes", "Devil Fruit User"
			,"Older Sister"	};
		change(a,these);
		database.add(a);
	}
	public void addMeliodas() {
		Individual a = new Individual("Meliodas","https://tinyurl.com/33st9ezx");
		String[] these = {"Seven Deadly Sins", "Demon or Devil","Yellow Hair", "Green Eyes" 
			,"Older Brother"	};
		change(a,these);
		database.add(a);
	}
	public void addShikamaru() {
		Individual a = new Individual("Shikamaru","https://tinyurl.com/r3eezzfa");
		String[] these = {"Naruto", "Use Shadows","Black Hair", "Brown Eyes" 
				};
		change(a,these);
		database.add(a);
	}
	public void addNezuko() {
		Individual a = new Individual("Nezuko","https://tinyurl.com/42cacx7h");
		String[] these = {"Demon Slayer", "Female","Demon or Devil","Black Hair", "Pink Eyes" 
			,"Older Sister","Younger Sister"	};
		change(a,these);
		database.add(a);
	}
	public void addKurapika() {
		Individual a = new Individual("Kurapika","https://tinyurl.com/cwmyby4b");
		String[] these = {"Hunter x Hunter", "Yellow Hair" 
			,"Eye Powers"	};
		String[]these2 = {"Red Eyes", "Gray Eyes","Brown Eyes"};
		change(a,these);
		unknown(a,these2);
		database.add(a);
	}
	public void addUlquiorra() {
		Individual a = new Individual("Ulquiorra","https://tinyurl.com/357wjpv5");
		String[] these = {"Bleach", "Black Hair" 
			,"Green Eyes","Hollow","Villain"	};
		String[]these2 = {"Demon or Devil"};
		change(a,these);
		unknown(a,these2);
		database.add(a);
	}
	public void addRenji() {
		Individual a = new Individual("Renji","https://tinyurl.com/y68fat79");
		String[] these = {"Bleach", "Red Hair" 
			,"Brown Eyes"	};
		
		change(a,these);
		
		database.add(a);
	}
	public void addShanks() {
		Individual a = new Individual("Shanks","https://tinyurl.com/3ukjznef");
		String[] these = {"One Piece", "Red Hair" 
			,"Black Eyes","Pirate"	};
		
		change(a,these);
		
		database.add(a);
	}
	public void addLaw() {
		Individual a = new Individual("Law","https://tinyurl.com/h4cf9c4f");
		String[] these = {"One Piece", "Devil Fruit User" 
			,"Pirate","Older Brother"	};
		String[]these2 = {"Black Hair","Blue Hair","Gray Eyes"};
		change(a,these);
		unknown(a,these2);
		database.add(a);
	}
	public void addTanjiro() {
		Individual a = new Individual("Tanjiro","https://tinyurl.com/wk3nx86h");
		String[] these = {"Demon Slayer", "Protagonist" 
			,"Red Eyes","Older Brother"	};
		String[]these2 = {"Black Hair","Red Hair","Demon or Devil"};
		change(a,these);
		unknown(a,these2);
		database.add(a);
	}
	public void addZenitsu() {
		Individual a = new Individual("Zenitsu","https://tinyurl.com/ns5k2zky");
		String[] these = {"Demon Slayer", "Yellow Hair" 
				};
		String[]these2 = {"Black Hair","Brown Eyes","Golden Eyes","Orange Hair"};
		change(a,these);
		unknown(a,these2);
		database.add(a);
	}
	public void addMuzan() {
		Individual a = new Individual("Muzan Kibutsuji","https://tinyurl.com/rr8z8hxc");
		String[] these = {"Demon Slayer", "Villain","Demon or Devil","Red Eyes","Black Hair" 
				};
		String[]these2 = {"White Hair"};
		change(a,these);
		unknown(a, these2);
		database.add(a);
	}
	public void addNoelle() {
		Individual a = new Individual("Noelle","https://tinyurl.com/6ffhm8b2");
		String[] these = {"Black Clover", "Female","Younger Sister" 
				};
		String[]these2 = {"Gray Hair"};
		change(a,these);
		unknown(a, these2);
		database.add(a);
	}
	public void addYuno() {



		Individual a = new Individual("Yuno","https://tinyurl.com/r3sdz68");
		String[] these = {"Black Clover", "Black Hair"};
		String[]these2 = {"Golden Eyes"};
		change(a,these);
		unknown(a,these2);
		database.add(a);	
	}
	public void change(Individual a,String[]list) {		
		
		for(String b:list) {
			a.properties.put(b, "yes");
		}
		
	}
	public void unknown(Individual a,String[]list) {
		for(String b:list) {
			a.properties.put(b, "idk");
		}
		
	}

	


}
