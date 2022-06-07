import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose your username");
		String username = sc.nextLine();
		System.out.println("Your username is " + username);
		
		System.out.println("Choose your role(warrior, rogue, wizard)");
		String role1 = sc.nextLine();
		String role = new String("");
		int finale;
		finale = 0;
		if(role1.equals("wizard")){
			role = "Wizard";
			finale = 7;
		}else if(role1.equals("warrior")){
			role = "Warrior";
			finale = 7;
		}else if(role1.equals("rogue")){
			role = "Rogue";
			finale = 7;
		}else if(role1.equals("Wizard")){
			role = "Wizard";
			finale = 7;
		}else if(role1.equals("Warrior")){
			role = "Warrior";
			finale = 7;
		}else if(role1.equals("Rogue")){
			role = "Rogue";
			finale = 7;
		}else{
			System.out.println("Sorry thats not a role you can choose try again next time");
			finale = 9;
		}
		
		if(finale == 7){
			System.out.println("You are a " + role);
			int total;
			total = 25;
			System.out.println("You have " + total + " points to spend on your characters stats. One stat can only have a max of 10 points.");
			
			int total1;
			total1 = 0;
			System.out.println("Determine your strength! How many points will you spend on strength?");
			int strength = sc.nextInt();
			if(strength <= 10){
				total1 = total - strength;
			}else if(strength > 10){
				System.out.println("Sorry that is past the max amount of points! How many points will you spend on strength?");
				int strength1 = sc.nextInt();
				if(strength1 <= 10){
					total1 = total - strength1;
					strength = strength1;
				}else if(strength1 > 10){
					System.out.println("LOL YOUR BAD YOU GET NO POINTS FOR STRENGTH");
					strength = 0;
					total1 = total;
				}	
			}
			System.out.println("You have a strength of " + strength + ". You have " + total1 + " points left");
			
			int total2;
			total2 = 0;
			System.out.println("Determine your dexterity! How many points will you spend on dexterity?");
			int dexterity = sc.nextInt();
			if(dexterity <= 10){
				total2 = total1 - dexterity;
			}else if(dexterity > 10){
				System.out.println("Sorry that is past the max amount of points! How many points will you spend on dexterity?");
				int dexterity1 = sc.nextInt();
				if(dexterity1 <= 10){
					total2 = total1 - dexterity1;
					dexterity = dexterity1;
				}else if(dexterity1 > 10){
					System.out.println("LMFAO GO TO SCHOOL YOU GET NO POINTS FOR DEXTERITY");
					dexterity = 0;
					total2 = total1;
				}
			}
			System.out.println("You have a dexterity of " + dexterity + ". You have " + total2 + " points left");
			
			int total3;
			total3 = 0;
			System.out.println("Determine you inteligence! How many points will you spend on inteligence?");
			int inteligence = sc.nextInt();
			if(inteligence <= total2){
				if(inteligence <= 10){
					total3 = total2 - inteligence;
				}else if(inteligence > 10){
					System.out.println("Sorry that is past the max amount of points! How many points will you spend on inteligence?");
					int inteligence1 = sc.nextInt();
					if(inteligence1 <= 10){
						total3 = total2 - inteligence1;
						inteligence = inteligence1;
					}else if(inteligence1 > 10){
						System.out.println("SDKFDFOIJDSFL YOUR ACTUALLY DUMB YOU GET NO POINTS FOR INTELIGENCE");
					}
				}
			}else if(inteligence > total2){
				System.out.println("Sorry you only have "  + total2 + " points left! How many points will you spend on inteligence?");
				int inteligence2 = sc.nextInt();
				if(inteligence2 <= total2){
					if(inteligence2 <= 10){
						total3 = total2 - inteligence2;
						inteligence = inteligence2;
					}else if(inteligence2 > 10){
						System.out.println("Sorry that is past the max amount of points! How many points will you spend on inteligence?");
						int inteligence3 = sc.nextInt();
						if(inteligence3 <= 10){
							total3 = total2 - inteligence3;
							inteligence = inteligence3;
						}else if(inteligence3 > 10){
							System.out.println("SDKFDFOIJDSFL YOUR ACTUALLY DUMB YOU GET NO POINTS FOR INTELIGENCE");
						}
					}
				}else if(inteligence > total2){
					System.out.println("SDKFDFOIJDSFL YOUR ACTUALLY DUMB YOU GET NO POINTS FOR INTELIGENCE");
				}
			}
			System.out.println("You have a inteligence of " + inteligence + ". You have " + total3 + " points left.");
			
			if(total3 == 0){
				System.out.println("You:");
				System.out.println("Username: " + username);
				System.out.println("Role: " + role);
				System.out.println("Stats- ");
				System.out.println("Strength: "+ strength);
				System.out.println("Dexterity" + dexterity);
				System.out.println("Inteligence: " + inteligence);
				System.out.println("Constitution: 0");
				System.out.println("Charisma: 0");
			}else if( total3 > 0){
				int total4;
				total4 = 0;
				System.out.println("Determine you constitution! How many points will you spend on constitution?");
				int constitution = sc.nextInt();
				if(constitution <= total3){
					if(constitution <= 10){
						total4 = total3 - constitution;
					}else if(constitution > 10){
						System.out.println("Sorry that is past the max amount of points! How many points will you spend on constitution?");
						int constitution1 = sc.nextInt();
						if(constitution1 <= 10){
							total4 = total3 - constitution1;
							constitution = constitution1;
						}else if(constitution1 > 10){
							System.out.println("WEEWOO HAA STUPID NO POINTS FOR CONSTITUTION");
						}
					}
				}else if(constitution > total3){
					System.out.println("Sorry you only have "  + total3 + " points left! How many points will you spend on constitution?");
					int constitution2 = sc.nextInt();
					if(constitution2 <= total3){
						if(constitution2 <= 10){
							total4 = total3 - constitution2;
							constitution = constitution2;
						}else if(constitution2 > 10){
							System.out.println("Sorry that is past the max amount of points! How many points will you spend on constitution?");
							int constitution3 = sc.nextInt();
							if(constitution3 <= 10){
								total4 = total3 - constitution3;
								constitution = constitution3;
							}else if(constitution3 > 10){
								System.out.println("WEEWOO HAA STUPID NO POINTS FOR CONSTITUTION");
							}
						}
					}else if(constitution2 > total3){
						System.out.println("WEEWOO HAA STUPID NO POINTS FOR CONSTITUTION");
					}
				}
				System.out.println("You have a constitution of " + constitution + ". You have " + total4 + " points left.");
				
				if(total4 == 0){
					System.out.println("You:");
					System.out.println("Username: " + username);
					System.out.println("Role: " + role);
					System.out.println("Stats- ");
					System.out.println("Strength: "+ strength);
					System.out.println("Dexterity" + dexterity);
					System.out.println("Inteligence: " + inteligence);
					System.out.println("Constitution: " + constitution);
					System.out.println("Charisma: 0");
				}else if(total4 > 0){
					int total5;
					total5 = 0;
					System.out.println("Determine you charisma! How many points will you spend on charisma?");
					int charisma = sc.nextInt();
					if(charisma <= total4){
						if(charisma <= 10){
							total5 = total4 - charisma;
						}else if(charisma > 10){
							System.out.println("Sorry that is past the max amount of points! How many points will you spend on charisma?");
							int charisma1 = sc.nextInt();
							if(charisma1 <= 10){
								total5 = total4 - charisma1;
								charisma = charisma1;
							}else if(charisma1 > 10){
								System.out.println("PFFFFFFFFT YOU FOOL YOU GET 0 POINTS FOR CHARISMA");
							}
						}
					}else if(charisma > total4){
						System.out.println("Sorry you only have "  + total4 + " points left! How many points will you spend on charisma?");
						int charisma2 = sc.nextInt();
						if(charisma2 <= total4){
							if(charisma2 <= 10){
								total5 = total4 - charisma2;
								charisma = charisma2;
							}else if(charisma2 > 10){
								System.out.println("Sorry that is past the max amount of points! How many points will you spend on charisma?");
								int charisma3 = sc.nextInt();
								if(charisma3 <= 10){
									total5 = total4 - charisma3;
									charisma = charisma3;
								}else if(charisma3 > 10){
									System.out.println("PFFFFFFFFT YOU FOOL YOU GET 0 POINTS FOR CHARISMA");
								}
							}
						}else if(charisma2 > total4){
							System.out.println("PFFFFFFFFT YOU FOOL YOU GET 0 POINTS FOR CHARISMA");
						}
					}
					System.out.println("You have a constitution of " + charisma + ". You have " + total5 + " points left.");
					
					System.out.println("You info;");
					System.out.println("Username: " + username);
					System.out.println("Role: " + role);
					System.out.println("Stats- ");
					System.out.println("Strength: "+ strength);
					System.out.println("Dexterity" + dexterity);
					System.out.println("Inteligence: " + inteligence);
					System.out.println("Constitution: " + constitution);
					System.out.println("Charisma: "+ charisma);
				}
			}
		}else if(finale == 9){
			System.out.println("Game Over");
		}	
	}
}
