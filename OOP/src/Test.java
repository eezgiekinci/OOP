import java.io.*;
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		
				// test of secretary class
		
				Secretary sekreter = new Secretary(1,"Ezgi Ekinci");
				
				System.out.println(sekreter);
				
				sekreter.getTaskInformation();
				
				// test of technical staff class
				
				TechnicalStaff tekniker = new TechnicalStaff(1,"Ali Dikbıyık");
				
				System.out.println(tekniker);
				
				tekniker.getTaskInformation();
				
				// test of cleaning staff class
				
				CleaningStaff temizlik = new CleaningStaff(1,"Adnan Islakburun");
						
				System.out.println(temizlik);
						
				temizlik.getTaskInformation();
				
				// add lecturer:
				
				Lecturer lecturer1 = new Lecturer(1, "Ahmet Yaşar Yaşamaz");
				
				Lecturer lecturer2 = new Lecturer(2, "Zeynep Zeytingözlü");
				
				Lecturer lecturer3 = new Lecturer(3, "Gencay Yaşlı");
				
				Lecturer lecturer4 = new Lecturer(4, "Ayaz Yaz");
				
				Lecturer lecturer5 = new Lecturer(5, "Ayla Koreli");
				
				Lecturer lecturer6 = new Lecturer(6, "Furkan Şeker");
				
				Lecturer lecturer7 = new Lecturer(7, "Şule Sabit");
				
				Lecturer lecturer8 = new Lecturer(8, "Fatma Tezyazar");
				
				Lecturer lecturer9 = new Lecturer(9, "Hilmi Katsahibi");
				
				Lecturer lecturer10 = new Lecturer(10, "Erkan Matematik");
				
				Lecturer lecturer11 = new Lecturer(11, "Burcu Hepgüler");
				
				Lecturer lecturer12 = new Lecturer(12, "Binnaz Abla");
				
				//Bachelor's Degree courses:
				
				UnderGraduateCourse ugc1 = new UnderGraduateCourse("BM101", "COMPUTER PROGRAMMING 1", 5);
				
				UnderGraduateCourse ugc2 = new UnderGraduateCourse("BM103", "INTRODUCTION TO COMPUTER ENGINEERING", 4);
				
				UnderGraduateCourse ugc3 = new UnderGraduateCourse("ENG103", "ENGLISH 1", 3 );
				
				UnderGraduateCourse ugc4 = new UnderGraduateCourse("PHY103", "PHYSICS 1", 6);
				
				UnderGraduateCourse ugc5 = new UnderGraduateCourse("MATH101", "MATHEMATICS 1", 6);
				
				UnderGraduateCourse ugc6 = new UnderGraduateCourse("MATH199", "LINEAR ALGEBRA", 4);
				
				UnderGraduateCourse ugc7 = new UnderGraduateCourse("BM207", "PROBABILITY AND STATISTICS", 4);
				
				UnderGraduateCourse ugc8 = new UnderGraduateCourse("BM211", "ELECTRICAL AND ELECTRONIC CIRCUITS", 5);
				
				UnderGraduateCourse ugc9 = new UnderGraduateCourse("CENG205","DATA STRUCTURES",6);
				
				UnderGraduateCourse ugc10 = new UnderGraduateCourse("CENG213","OBJECT ORIENTED PROGRAMMING",6);
				
				UnderGraduateCourse ugc11 = new UnderGraduateCourse("MATH201","DIFFERENTIAL EQUATIONS", 5);
				
				UnderGraduateCourse ugc12 = new UnderGraduateCourse("CENG313", "INTRODUCTION TO DATA SCIENCE", 4);
				
				UnderGraduateCourse ugc13 = new UnderGraduateCourse("CENG351","ROBOTICS",6);
				
				UnderGraduateCourse ugc14 = new UnderGraduateCourse("CENG367", "SCRIPTING LANGUAGES", 6);

				UnderGraduateCourse ugc15 = new UnderGraduateCourse("B-15", "COURSE 15", 6);
				
				UnderGraduateCourse ugc16 = new UnderGraduateCourse("B-16", "COURSE 16", 5);
				
				UnderGraduateCourse ugc17 = new UnderGraduateCourse("B-17", "COURSE 17", 4);
				
				UnderGraduateCourse ugc18 = new UnderGraduateCourse("B-18", "COURSE 18", 3 );
				
				UnderGraduateCourse ugc19 = new UnderGraduateCourse("B-19", "COURSE 19", 6);
				
				UnderGraduateCourse ugc20 = new UnderGraduateCourse("B-20", "COURSE 20", 6);
				
				UnderGraduateCourse ugc21 = new UnderGraduateCourse("B-21", "COURSE 21", 4);
				
				UnderGraduateCourse ugc22 = new UnderGraduateCourse("B-22", "COURSE 22", 4);
				
				UnderGraduateCourse ugc23 = new UnderGraduateCourse("B-23", "COURSE 23", 5);
				
				UnderGraduateCourse ugc24 = new UnderGraduateCourse("B-24","COURSE 24",6);
				
				UnderGraduateCourse ugc25 = new UnderGraduateCourse("B-25","COURSE 25",6);
				
				UnderGraduateCourse ugc26 = new UnderGraduateCourse("B-26","COURSE 26", 5);
				
				UnderGraduateCourse ugc27 = new UnderGraduateCourse("B-27", "COURSE 27", 4);
				
				UnderGraduateCourse ugc28 = new UnderGraduateCourse("B-28","COURSE 28",6);
				
				UnderGraduateCourse ugc29 = new UnderGraduateCourse("B-29", "COURSE 29", 6);
				
				UnderGraduateCourse ugc30 = new UnderGraduateCourse("B-30", "COURSE 30", 6);
				
				UnderGraduateCourse ugc31 = new UnderGraduateCourse("B-31", "COURSE 31", 5);
				
				UnderGraduateCourse ugc32 = new UnderGraduateCourse("B-32", "COURSE 32", 4);
				
				UnderGraduateCourse ugc33 = new UnderGraduateCourse("B-33", "COURSE 33", 3 );
				
				UnderGraduateCourse ugc34 = new UnderGraduateCourse("B-34", "COURSE 34", 6);
				
				UnderGraduateCourse ugc35 = new UnderGraduateCourse("B-35", "COURSE 35", 6);
				
				UnderGraduateCourse ugc36 = new UnderGraduateCourse("B-36", "COURSE 36", 4);
				
				UnderGraduateCourse ugc37 = new UnderGraduateCourse("B-37", "COURSE 37", 4);
				
				UnderGraduateCourse ugc38 = new UnderGraduateCourse("B-38", "COURSE 38", 5);
				
				UnderGraduateCourse ugc39 = new UnderGraduateCourse("B-39","COURSE 39",6);
				
				UnderGraduateCourse ugc40 = new UnderGraduateCourse("B-40","COURSE 40",6);
				
				UnderGraduateCourse b41 = new UnderGraduateCourse("B-41","COURSE 41", 5);
				
				UnderGraduateCourse ugc42 = new UnderGraduateCourse("B-42", "COURSE 42", 4);
				
				UnderGraduateCourse ugc43 = new UnderGraduateCourse("B-43","COURSE 43",6);
				
				UnderGraduateCourse ugc44 = new UnderGraduateCourse("B-44", "COURSE 44", 6);
				
				UnderGraduateCourse ugc45 = new UnderGraduateCourse("B-45", "COURSE 45", 6); 
			
				//Master's Degree Courses:
				
				GraduateCourse gc1 = new GraduateCourse("M401", "DESIGN PATTERNS", 8);
				
				GraduateCourse gc2 = new GraduateCourse("M402", "LANGUAGE THEORY", 8);
				
				GraduateCourse gc3 = new GraduateCourse("M403", "PROJECT MANAGEMENT", 8);
				
				GraduateCourse gc4 = new GraduateCourse("M101","THESIS",12);
				
				GraduateCourse gc5 = new GraduateCourse("M503","OBJECT ORIENTED PROGRAMMING",10);
				
				GraduateCourse gc6 = new GraduateCourse("M551","ROBOTICS",7);
				
				GraduateCourse gc7 = new GraduateCourse("M567","IMAGINE PROCESSING",8);
				
				GraduateCourse gc8 = new GraduateCourse("M513","ENGINEERING MATHEMATICS",10);
				
				GraduateCourse gc9 = new GraduateCourse("M507","ADVANCED DATA STRUCTURES",8);
				
				GraduateCourse gc10 = new GraduateCourse("M503","SCRIPTING LANGUAGES",8);
				
				//Doctoral's Degree Courses:
				
				GraduateCourse dgc1 = new GraduateCourse("D501", "TECHNICAL ELECTIVE", 8);
				
				GraduateCourse dgc2 = new GraduateCourse("D502", "TECHNICAL ELECTIVE", 8);
				
				GraduateCourse dgc3 = new GraduateCourse("D503", "TECHNICAL ELECTIVE", 8);
				
				GraduateCourse dgc4 = new GraduateCourse("D101","THESIS",15);
				
				GraduateCourse dgc5 = new GraduateCourse("D503","OBJECT ORIENTED PROGRAMMING",10);
				
				GraduateCourse dgc6 = new GraduateCourse("D551","ROBOTICS",7);
				
				GraduateCourse dgc7 = new GraduateCourse("D567","IMAGINE PROCESSING",8);
				
				GraduateCourse dgc8 = new GraduateCourse("D513","ENGINEERING MATHEMATICS",10);
				
				GraduateCourse dgc9 = new GraduateCourse("D507","ADVANCED DATA STRUCTURES",8);
				
				GraduateCourse dgc10 = new GraduateCourse("D503","SCRIPTING LANGUAGES",8);
				
				
				
				HeadOfDepartment h1 = new HeadOfDepartment(1,"Sacit Kral");
				
				// testing the method is called AddCourse() where at Lecturer:
				
				lecturer1.AddCourse(ugc1);
				lecturer2.AddCourse(ugc2);
				lecturer3.AddCourse(ugc3);
				lecturer4.AddCourse(ugc4);
				lecturer5.AddCourse(ugc5);
				lecturer6.AddCourse(ugc6);
				
				lecturer1.AddCourse(ugc7);
				lecturer2.AddCourse(ugc8);
				lecturer3.AddCourse(ugc9);
				lecturer4.AddCourse(ugc10);
				lecturer5.AddCourse(ugc11);
				lecturer6.AddCourse(ugc12);
				
				lecturer1.AddCourse(ugc13);
				lecturer2.AddCourse(ugc14);
				lecturer7.AddCourse(gc1);
				lecturer8.AddCourse(gc2);
				lecturer9.AddCourse(gc3);
				lecturer10.AddCourse(gc4);
				
				lecturer11.AddCourse(gc5);
				lecturer12.AddCourse(gc6);
				lecturer7.AddCourse(gc7);
				lecturer8.AddCourse(gc8);
				lecturer9.AddCourse(gc9);
				lecturer10.AddCourse(gc10);
				
				lecturer7.AddCourse(dgc1);
				lecturer8.AddCourse(dgc2);
				lecturer9.AddCourse(dgc3);
				lecturer10.AddCourse(dgc4);
				
				lecturer11.AddCourse(dgc5);
				lecturer12.AddCourse(dgc6);
				lecturer7.AddCourse(dgc7);
				lecturer8.AddCourse(dgc8);
				lecturer9.AddCourse(dgc9);
				lecturer10.AddCourse(dgc10);
				
				
				
				// add undergraduate student:
				
				UnderGraduate ugStudent1 = new UnderGraduate(1, "Elif Ezgi", 2021);
				UnderGraduate ugStudent2 = new UnderGraduate(1, "Can Perk", 2021);
				UnderGraduate ugStudent3 = new UnderGraduate(1, "İlker Bayraktar", 2019);
				UnderGraduate ugStudent4 = new UnderGraduate(1, "Ömer Uçmaz", 2020);
				UnderGraduate ugStudent5 = new UnderGraduate(1, "Berkesu Pamukşeker", 2020);
				UnderGraduate ugSudent6 = new UnderGraduate(1, "Öykü Suskun", 2018);
				UnderGraduate ugStudent7 = new UnderGraduate(1, "Aylin Zaman", 2019);
				UnderGraduate ugStudent8 = new UnderGraduate(1, "Ebru Uslu", 2019);
				UnderGraduate ugStudent9 = new UnderGraduate(1, "Emir Candan", 2020);
				UnderGraduate ugStudent10 = new UnderGraduate(1, "Çağla İlkbahar", 2021);
				
				// add master student:
				
				Master mStudent1 = new Master(1, "Üzüm Adanalı", 2016);
				Master mStudent2 = new Master(2, "Gökhan Banabak", 2017);
				Master mStudent3 = new Master(3, "Ada Adıyaman", 2021);
				Master mStudent4 = new Master(4, "Ahmet Mehmet", 2019);
				Master mStudent5 = new Master(5, "Mercan Işık", 2020);
				
				// add doctoral student:
				
				Doctoral dStudent1 = new Doctoral(1, "Ahmet Terzi", 2016);
				Doctoral dStudent2 = new Doctoral(2, "Nusret Kasap", 2015);
				Doctoral dStudent3 = new Doctoral(3, "Ece Su", 2021);
				Doctoral dStudent4 = new Doctoral(4, "Damla Pekgüzel", 2019);
				Doctoral dStudent5 = new Doctoral(5, "Esra Adıgüzel", 2020);
				
				System.out.println("*****************************************************************");
				
				// testing the method is called addCourse() where at Student:
				
				ugStudent1.addCourse(ugc1);
				ugStudent1.addCourse(ugc2);
				ugStudent1.addCourse(ugc3);
				ugStudent1.addCourse(ugc4);
				ugStudent1.addCourse(ugc5);
				ugStudent5.addCourse(ugc6);
				
				//testing the method is called addCourse() where at Student. What will happen when a student takes same course:
				
				ugStudent1.addCourse(ugc1);
				
				
				System.out.println("*****************************************************************");
				
				for(int i =0 ; i<ugStudent1.getCourses().size();i++)
					System.out.println(ugStudent1.getCourses().get(i).getCode());
				
		
				System.out.println("*****************************************************************");
				
				System.out.print(lecturer1.getFullName() + ": ");
				for(int i = 0; i< lecturer1.getGivenCourses();i++)
					System.out.print(lecturer1.getCourses().get(i).getName() + ", ");
				System.out.println();
				
				//testing the method is called changeLecturer() where at Secretary:
				
				//b10 is a course and we want to learn the lecturer who give the b10:
						
				System.out.print(ugc10.getLecturer().getFullName()+ ": ");
				
				for(int i = 0; i< ugc10.getLecturer().getGivenCourses();i++)
					
					System.out.print(ugc10.getLecturer().getCourses().get(i).getName() + ", ");
				
				System.out.println();
				
				// now, we test the method changeLecturer():
				
				sekreter.changeLecturer(ugc10, lecturer1,lecturer4);
				
				// b10's lecturer has changed.
				
				System.out.print(ugc10.getLecturer().getFullName() + ": ");
				for(int i = 0; i< ugc10.getLecturer().getGivenCourses();i++)
					System.out.print(ugc10.getLecturer().getCourses().get(i).getName() + ", ");
				System.out.println();
				
				System.out.print(lecturer4.getFullName() + ": ");
				for(int i = 0; i< lecturer4.getGivenCourses();i++)
					System.out.print(lecturer4.getCourses().get(i).getName() + ", ");
				System.out.println();
				
				System.out.println("*****************************************************************");
				
				// testing the method is called addNote() where at Lecturer:
				
				lecturer10.setGrade(ugc1, ugStudent1, 55);
				
				lecturer6.setGrade(ugc6, ugStudent5, 90);
				lecturer6.setGrade(ugc6, ugStudent5, 110);
				
				
				//a test of whether the student can grade herself/himself
				//ugStudent5.setGrades(ugc6,ugStudent5,100);
		
				
		
				
				//testing the method is called calculateGpa() where at Student(master):
				
				mStudent1.addCourse(gc1);
				mStudent1.addCourse(gc2);
				mStudent1.addCourse(gc3);
				mStudent1.addCourse(gc4);
				mStudent1.addCourse(gc5);
				mStudent1.addCourse(gc6);
				mStudent1.addCourse(gc7);
				mStudent1.addCourse(gc8);
				
				lecturer7.setGrade(gc1, mStudent1, 90);
				lecturer8.setGrade(gc2, mStudent1, 90);
				lecturer9.setGrade(gc3, mStudent1, 90);
				lecturer10.setGrade(gc4, mStudent1, 90);
				lecturer11.setGrade(gc5, mStudent1, 90);
				lecturer12.setGrade(gc6, mStudent1, 90);
				lecturer7.setGrade(gc7, mStudent1, 90);
				lecturer8.setGrade(gc8, mStudent1, 90);
				
				//generics method çağırma
				
				//public <T> T myGenericMethod()
				
				//public <T> void myGenericVoidMethod(T object)
				
				
				
				HeadOfDepartment hod1 = new HeadOfDepartment(1,"Osman Yılmaz");
				//testing the method is called giveCertificate() where at HeadOfDepartment:

				hod1.giveCertificate(mStudent1);
				System.out.println(mStudent1.calculateGpa());



			
				
				
				
				
				

				
		
	}

}
