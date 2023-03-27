import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;

public class Project extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();

    public Project() {
        initComponents();
    }

    private void initComponents() {

        jlabel = new javax.swing.JLabel();
        student = new javax.swing.JButton();
        course = new javax.swing.JButton();
        enroll = new javax.swing.JButton();
        grade = new javax.swing.JButton();
        report = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlabel.setFont(new java.awt.Font("Tahoma", 0, 27));
        jlabel.setText("University Enrollment");
      
        student.setText("Student Information");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	studentActionPerformed(evt);
            }
        });

        course.setText("Course Information");
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	courseActionPerformed(evt);
            }
        });

        enroll.setText("Enrollment Information");
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	enrollActionPerformed(evt);
            }
        });

        grade.setText("Grade Management");
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	gradeActionPerformed(evt);
            }
        });

        report.setText("Reports");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	reportActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	clearActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	seeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grade)
                            .addComponent(course)
                            .addComponent(student)
                        	.addComponent(jlabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(report))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(enroll)))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(view)
                .addGap(36, 36, 36)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel)
                .addGap(74, 74, 74)
                .addComponent(student)
                .addGap(31, 31, 31)
                .addComponent(course)
                .addGap(30, 30, 30)
                .addComponent(enroll)
                .addGap(36, 36, 36)
                .addComponent(grade)
                .addGap(29, 29, 29)
                .addComponent(report)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(view)))
        );

        pack();
    }

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {
        
        course_info stud = new course_info();
        stud.main(new String[]{""});
        this.dispose();
    }

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {
        
        student_info stud = new student_info();
        stud.main(new String[]{""});
        this.dispose();      
    }

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {
       
        enrollment_info enroll = new enrollment_info();
        enroll.main(new String[]{""});
        this.dispose();
    }

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {
        
        grade_management grade = new grade_management();
        grade.main(new String[]{""});
        this.dispose();
    }

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {
        
        reports report = new reports();
        report.main(new String[]{""});
        this.dispose();
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
       
        Reader_Writer rw = new Reader_Writer();
        rw.clear();        
    }

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {
        
        rw.see();
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    private javax.swing.JButton clear;
    private javax.swing.JButton course;
    private javax.swing.JButton enroll;
    private javax.swing.JButton grade;
    private javax.swing.JLabel jlabel;
    private javax.swing.JButton report;
    private javax.swing.JButton view;
    private javax.swing.JButton student;
}

 class Course implements Serializable {
  
	private static final long serialVersionUID = 1L;
	
	String id, name, coordinator;

    public Course(String id, String name, String coordinator) {
        this.id = id;
        this.name = name;
        this.coordinator = coordinator;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", professor=" + coordinator + '}';
    }

	public Object getId() {
		
		return null;
	}
}
 
class course_info extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();

    public course_info() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        coordinator = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        course_1 = new javax.swing.JTextField();
        find = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Course Information");

        jLabel2.setText("Course ID");

        jLabel3.setText("Course Name");

        course.setEditable(false);

        jLabel4.setText("Professor");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	submitActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	backActionPerformed(evt);
            }
        });

        jLabel5.setText("Course ID");

        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(back)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(submit))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel4))
                                                        .addGap(65, 65, 65)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(course)
                                                                .addComponent(name)
                                                                .addComponent(coordinator, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(110, 110, 110)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(find)
                                                        .addComponent(course_1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(course_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(find)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(coordinator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submit)
                                        .addComponent(back))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        pack();
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
       
        String cid = course.getText();
        String cname = name.getText();
        String coord = coordinator.getText();
        Course cor = new Course(cid, cname, coord);
        ArrayList<Course> al = rw.getCourseList();
        boolean mod = false;
        for(int i=0;i<al.size();++i){
            if(al.get(i).id.equals(cor.id)){
                Course c = al.get(i);
                c.name = cor.name;
                c.coordinator = cor.coordinator;
                mod = true;
                break;
            }
        }
        if(!mod){
            
        	al.add(cor);
        }
        rw.setCoursetList(al);
        if(mod){
            
        	JOptionPane.showMessageDialog(null, "Modified Existing Course Record");
        }
        else{
            
        	JOptionPane.showMessageDialog(null, "New Course Added");
        }
        
        Overview ov = rw.readOverview();
        ov.courses +=1;
        rw.writeOverview(ov);
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
       
    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }

    private void findActionPerformed(java.awt.event.ActionEvent evt) {
        
        ArrayList<Course> al = rw.getCourseList();
        String sid = course_1.getText();
        boolean found = false;
        for(Course st : al){
            if(st.id.equals(sid)){
                name.setText(st.name);
                coordinator.setText(st.coordinator);
                found = true;
                break;
            }
        }
        if(found){
            
        	JOptionPane.showMessageDialog(null, "Found a course with matching ID");
        }
        else{
            
        	JOptionPane.showMessageDialog(null, "No record found with matching ID, Please try again");
        }
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(course_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(course_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(course_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(course_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        File file = new File("overview.txt");
        if(!file.exists()) rw.writeOverview(new Overview(0, 0));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course_info().setVisible(true);
                Overview ov = rw.readOverview();
                int id = ov.courses;
                course.setText("0"+(id+1));
            }
        });
    }

    private javax.swing.JButton back;
    private javax.swing.JTextField coordinator;
    private static javax.swing.JTextField course;
    private javax.swing.JTextField course_1;
    private javax.swing.JButton find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
}

class enroll_success extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();

    public enroll_success() {
        initComponents();
    }

    public void setData(Enrollment enroll, String names, String namec){
        sid.setText(enroll.sid);
        cid.setText(enroll.cid);
        sname.setText(names);
        cname.setText(namec);
        year.setText(enroll.year);
        sem.setText(enroll.sem);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Successfully Enrolled");

        jLabel2.setText("Student ID");

        jLabel3.setText("Course ID");

        jLabel4.setText("Student Name");

        jLabel5.setText("Course Name");

        jLabel6.setText("Semester");

        jLabel7.setText("Year");

        sid.setEditable(false);

        cid.setEditable(false);

        sname.setEditable(false);

        cname.setEditable(false);

        sem.setEditable(false);

        year.setEditable(false);

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(home)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                                                .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(sname)
                                                                        .addComponent(cname)
                                                                        .addComponent(sem)
                                                                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                                        .addComponent(cid, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addComponent(home)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {
        
    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(enroll_success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(enroll_success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(enroll_success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(enroll_success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enroll_success().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField year;
}

class Enrollment implements Serializable {
   
	private static final long serialVersionUID = 1L;
	
	String sid, cid, year,sem;

    public Enrollment(String student_id, String course_id, String year, String sem) {
        this.sid = student_id;
        this.cid = course_id;
        this.year = year;
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "student_id=" + sid + ", course_id=" + cid + ", year=" + year + ", sem=" + sem + '}';
    }
}

class enrollment_info extends javax.swing.JFrame {
  
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();
    
	private static final String years[]
            = { "2023",
              "2022", "2021", "2020", "2019",
              "2018", "2017", "2016", "2015",
              "2014","2013", "2012", "2011"};
    private static final String sems[] = {"Winter", "Spring", "Summer", "Fall"};

    public enrollment_info() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enroll = new javax.swing.JButton();
        sid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        year = new java.awt.Choice();
        sem = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Enrollment Information");

        jLabel2.setText("Student ID");

        jLabel3.setText("Course ID");

        jLabel4.setText("Year");

        jLabel5.setText("Semester");

        enroll.setText("Enroll");
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	enrollActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(back)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(sid)
                                                        .addComponent(cid)
                                                        .addComponent(enroll, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(sem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(jLabel1)))
                                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(enroll)
                                        .addComponent(back))
                                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {
      
        String ids = sid.getText();
        String idc = cid.getText();
        String yr = years[year.getSelectedIndex()];
        String se = sems[sem.getSelectedIndex()];
        Enrollment enrol = new Enrollment(ids, idc, yr, se);
        ArrayList<Enrollment> al = rw.getEnrollList();
        ArrayList<Student> sal = rw.getStudentList();
        ArrayList<Course> cal = rw.getCourseList();
        boolean mod = false;
        int id =-1;
        boolean found = false;
        for(int i=0;i<al.size();++i){
            Enrollment st = al.get(i);
            if(st.cid.equals(idc) && st.sid.equals(ids)){
                if(st.year.equals(yr) && st.sem.equals(se)){
                    mod = true;
                    break;
                }
                found = true;
                id = i;
            }
        }
        if(mod){
            JOptionPane.showMessageDialog(null, "Already Enrolled");
        }
        else{
            if(found){
                enroll_success es = new enroll_success();
                es.setVisible(true);
                es.setData(enrol, sal.get(id).name, cal.get(id).name);
                this.dispose();
            }
            else{
                boolean sfound = false;
                String sname = "";
                String cname = "";
                for(int i=0;i<sal.size();++i){
                    Student st = sal.get(i);
                    if(st.id.equals(ids)){
                        sname = st.name;
                        sfound = true;
                    }
                }
                boolean cfound = false;
                for(int i=0;i<cal.size();++i){
                    Course st = cal.get(i);
                    if(st.id.equals(idc)){
                        cname = st.name;
                        cfound = true;
                    }
                }
                if(sfound && cfound) {
                    enroll_success es = new enroll_success();
                    es.setVisible(true);
                    es.setData(enrol, sname, cname);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter correct details Student ID / Course ID");
                }
            }
        }

    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
       
    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }
  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(enrollment_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(enrollment_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(enrollment_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(enrollment_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enrollment_info().setVisible(true);
                for(int i=0;i< years.length ; ++i){
                    year.add(years[i]);
                }
                for(int i=0;i<4;++i){
                    sem.add(sems[i]);
                }
            }
        });
    }

    private javax.swing.JButton back;
    private javax.swing.JTextField cid;
    private javax.swing.JButton enroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static java.awt.Choice sem;
    private javax.swing.JTextField sid;
    private static java.awt.Choice year;
}

class Grade implements Serializable{
   
	private static final long serialVersionUID = 1L;
	
	String sid, cid, year, sem, grade;

    public Grade(String sid, String cid, String year, String sem, String grade) {
        this.sid = sid;
        this.cid = cid;
        this.year = year;
        this.sem = sem;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" + "sid=" + sid + ", cid=" + cid + ", year=" + year + ", sem=" + sem + ", grade=" + grade + '}';
    }

}

class grade_management extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();
    
	private static final String years[]
            = { "2023",
            "2022", "2021", "2020", "2019",
            "2018", "2017", "2016", "2015",
            "2014","2013", "2012", "2011"};
    private static final String sems[] = {"Winter", "Spring","Summer","Fall"};
    
    public grade_management() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        year = new java.awt.Choice();
        sem = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel1.setText("Grade Management");

        jLabel2.setText("Student ID");

        jLabel3.setText("Year");

        jLabel4.setText("Semester");

        jLabel5.setText("Course ID");

        jLabel6.setText("Grade");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	homeActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(208, 208, 208)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(sid)
                                                                        .addComponent(cid)
                                                                        .addComponent(grade, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(back)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                                                .addComponent(submit)))))
                                .addContainerGap(348, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(back)
                                        .addComponent(submit))
                                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {

    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        
    	ArrayList<Student> sal = rw.getStudentList();
        ArrayList<Course> cal = rw.getCourseList();
        String ids = sid.getText();
        String idc = cid.getText();
        String gr = grade.getText();
        String yr = years[year.getSelectedIndex()];
        String sm = sems[sem.getSelectedIndex()];
        Grade cgr = new Grade(ids, idc, yr, sm, gr);
        ArrayList<Grade> al = rw.getGradeList();
        boolean mod = false;
        boolean found = false;
        int id  = -1;
        for(int i=0;i<al.size();++i){
            Grade st = al.get(i);
            if(st.cid.equals(idc) && st.sid.equals(ids)){
                if(st.year.equals(yr) && st.sem.equals(sm)){
                    st.grade=gr;
                    mod = true;
                    break;
                }
                found = true;
                id=i;
            }
        }
        if(mod){
            JOptionPane.showMessageDialog(null, "Modified Existing Grade Record");
        }
        else{
            if(found){
                al.add(cgr);
                JOptionPane.showMessageDialog(null, "New Grade Added");
            }
            else{
                boolean sfound = false, cfound =false;
                for(int i=0;i<sal.size();++i){
                    Student s = sal.get(i);
                    if(s.id.equals(ids)){
                        sfound = true;
                        break;
                    }
                }
                for(int i=0;i<cal.size();++i){
                    Course c = cal.get(i);
                    if(c.id.equals(idc)){
                        cfound = true;
                        break;
                    }
                }
                if(sfound && cfound){
                    al.add(cgr);
                    JOptionPane.showMessageDialog(null, "New Grade Added");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter correct details Student ID/ Course ID");
                }
            }
        }
        rw.setGradeList(al);
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(grade_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(grade_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(grade_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(grade_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grade_management().setVisible(true);
                for(int i=0;i< years.length ; ++i){
                    year.add(years[i]);
                }
                for(int i=0;i<4;++i){
                    sem.add(sems[i]);
                }
            }
        });
    }

    private javax.swing.JTextField cid;
    private javax.swing.JTextField grade;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static java.awt.Choice sem;
    private javax.swing.JTextField sid;
    private javax.swing.JButton submit;
    private static java.awt.Choice year;
}

class Overview implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	protected int students, courses;

    public Overview(int students, int courses) {
        this.students = students;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Overview{" + "students=" + students + ", courses=" + courses + '}';
    }
}

class student_info extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();

    public student_info() {
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sid_2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sid_1 = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        city = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        zip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Student Information");

        jLabel2.setText("Student ID");

        sid_2.setEditable(false);
        
        jLabel3.setText("Student Name");

        jLabel4.setText("Birthdate");

        jLabel5.setText("Street Address");

        jLabel7.setText("City");
        
        city.setEditable(false);
        
        jLabel8.setText("State");
        
        state.setEditable(false);
        
        jLabel9.setText("Zip Code");
        
        search.setText("Search");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	searchActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	backActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	submitActionPerformed(evt);
            }
        });

        jLabel6.setText("Student ID");

        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(back))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(sid_2)
                                                                .addComponent(sname)
                                                                .addComponent(number)
                                                                .addComponent(address)
                                                        		.addComponent(city)
                                                        		.addComponent(state)
                                                        		.addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(submit))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(search)
                                                                .addComponent(find))                                                        
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(sid_1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6)
                                        .addComponent(sid_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(find)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(sid_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32,32,32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                   
                                .addGap(35,35,35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                
                                .addGap(38,38,38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(search)
                                        .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))                                
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(back)
                                        .addComponent(submit))
                                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }
 
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
        
    	// This is were the API comes in from zip.getText() and retreives the the data to city and state
    	// when clicking the search button.
    	
    	String zipCode = zip.getText();
    	
    	ZipCodeClient zipCodeClient = new ZipCodeClient();
        zipCodeClient.setAPIURL(zipCode);
    	
        ZipCode code = new ZipCode();
    	String data = code.getCity();
    	String data1 = code.getState();
    	city.setText(data);
    	state.setText(data1);   	    	       
    }
    	
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        
    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {

    	String sid = sid_2.getText();
        String name = sname.getText();
        String num = number.getText();
        String mail = address.getText();

        String cities = city.getText();
        String states = state.getText();
        String zips = zip.getText();
        Student stud = new Student(sid, name, num, mail, cities, states, zips);
        ArrayList<Student> al = rw.getStudentList();
        boolean mod = false;
        
        for(int i=0;i<al.size();++i){
            if(al.get(i).id.equals(stud.id)){
                Student st = al.get(i);
                st.address = stud.address;
                st.birthday = stud.birthday;
                st.name = stud.name;
                
                st.cities = stud.cities;
                st.states = stud.states;
                st.zips = stud.zips;

                mod = true;
                break;
            }
        }
           
        if(!mod){
            
        	al.add(stud);
        }
        rw.setStudentList(al);
        if(mod){
            
        	JOptionPane.showMessageDialog(null, "Modified Existing Student record");
        }
        else{
            
        	JOptionPane.showMessageDialog(null, "New Student Recorded");
        }
        Overview ov = rw.readOverview();
        ov.students +=1;
        rw.writeOverview(ov);
    }

    private void findActionPerformed(java.awt.event.ActionEvent evt) {

    	ArrayList<Student> al = rw.getStudentList();
        String sid = sid_1.getText();
        boolean found = false;
        for(Student st : al){
            if(st.id.equals(sid)){
                sid_2.setText(sid);
                sname.setText(st.name);
                number.setText(st.birthday);
                address.setText(st.address);
                
                city.setText(st.cities);
                state.setText(st.states);;
                zip.setText(st.zips);;

                found = true;
                break;
            }
        }
        if(found){
            JOptionPane.showMessageDialog(null, "Found a student with matching ID");
        }
        else{
            JOptionPane.showMessageDialog(null, "No record found with matching ID, Please try again");
        }
    }

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(student_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        	 
        File file = new File("overview.txt");
        if(!file.exists()) rw.writeOverview(new Overview(0, 0));
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_info().setVisible(true);
                Overview ov = rw.readOverview();
                int id = ov.students;
                sid_2.setText("0"+(id+1));
            }
        });
    }
    
    private javax.swing.JButton back;
    private javax.swing.JTextField address;
    private javax.swing.JButton find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField number;
    private javax.swing.JTextField sid_1;
    private static javax.swing.JTextField sid_2;
    private javax.swing.JTextField sname;
    private javax.swing.JButton submit;
    private static javax.swing.JTextField city;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField state;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JTextField zip;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton search;
  
}

class Student implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	protected String id, name, birthday, address, cities, states, zips;

    public Student(String id, String name, String birthday, String address, String cities, String states, String zips) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        //Adding
        this.cities = cities;
        this.states = states;
        this.zips = zips;
        // till here
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", birthdate=" + birthday + ", address=" + address + ", city=" + cities + ", state=" + states + ", zip code=" + zips + '}';
    }

	public Object getId() {
		
		return null;
	}
}

class result {
    String sid, cid, year, grade;

    public result(String sid, String cid, String year, String grade) {
        this.sid = sid;
        this.cid = cid;
        this.year = year;
        this.grade = grade;
    }
}

class reports extends javax.swing.JFrame {
  
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();
    private static final String years[]
            = { "2023",
              "2022", "2021", "2020", "2019",
              "2018", "2017", "2016", "2015",
              "2014","2013", "2012", "2011"};

    public reports() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        year = new java.awt.Choice();
        course = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        back = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22));
        jLabel1.setText("Report Information");

        jLabel2.setText("Year");

        jLabel3.setText("Course");

        show.setText("Show Grades");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	showActionPerformed(evt);
            }
        });
        
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel1)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addComponent(back)
                                                .addGap(20, 20, 20)
                                				.addComponent(show)))
                                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                		.addComponent(back)
                                		.addComponent(show))
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }

    private void showActionPerformed(java.awt.event.ActionEvent evt) {
     
        ArrayList<Course> cal = rw.getCourseList();
        String yr = years[year.getSelectedIndex()];
        String cou = course.getText();
        boolean found =false;
        for(int i=0;i<cal.size();++i){
            if(cou.equals(cal.get(i).id)){
                found = true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(null, "Please enter correct Course ID");
        }
        else{
            report_info rep = new report_info();
            rep.setVisible(true);
            rep.setData(yr, cou);
            this.dispose();
        }

    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        
    	Project main = new Project();
        main.setVisible(true);
        this.dispose();
    }
    
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
                for(int i=0;i< years.length ; ++i){
                    year.add(years[i]);
                }
            }
        });
    }

    private javax.swing.JTextField course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton show;
    private javax.swing.JButton back;
    public static java.awt.Choice year;
}

class report_info extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
	protected static Reader_Writer rw = new Reader_Writer();

    public void setData(String year, String cou){
        ArrayList<Grade> gal = rw.getGradeList();
        ArrayList<result> res = new ArrayList<>();
        for(int i=0;i<gal.size();++i){
            Grade g = gal.get(i);
            if(g.year.equals(year) && g.cid.equals(cou)){
                res.add(new result(g.sid, g.cid , year, g.grade));
            }
        }
        for(result r : res){
            String[] row = {r.sid, r.cid, r.year, r.grade};
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(row);
        }
    }

    public report_info() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Student ID", "Course ID", "Year", "Grade"
                }
        ) {
           
			private static final long serialVersionUID = 1L;
			
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            @SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table);
        getContentPane().add(jScrollPane3, java.awt.BorderLayout.PAGE_START);
        
        pack();
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            
        	java.util.logging.Logger.getLogger(report_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            
        	java.util.logging.Logger.getLogger(report_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            
        	java.util.logging.Logger.getLogger(report_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        	java.util.logging.Logger.getLogger(report_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_info().setVisible(true);
            }
        });
    }

    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
}

class Reader_Writer {
    
	public static void main(String args[]){
        
		Reader_Writer rw = new Reader_Writer();
        Overview ov = new Overview(0, 0);
        rw.writeOverview(ov);
        ov = rw.readOverview();
        System.out.println(ov);
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("1","st1","num1","mail_1","city1","states1", "zip1"));
        al.add(new Student("2","st2","num2","mail_2","city2","states2", "zip2"));
        al.add(new Student("3","st3","num3","mail_3","city3","states3", "zip3"));
        al.add(new Student("4","st4","num4","mail_4","city4","states4", "zip4"));
                
        rw.setStudentList(al);
        al = rw.getStudentList();
        for(Student st : al){
            System.out.println(st);
        }
    }
	
    public void see(){
        
    	Reader_Writer rw = new Reader_Writer();
        Overview ov = rw.readOverview();
        
        System.out.println("see overview: "+ov);
        ArrayList<Student> sal = rw.getStudentList();
        for(Student st : sal){
            
        	System.out.println("see student: "+st);
        }
        ArrayList<Course> cal = rw.getCourseList();
        for(Course st : cal){
            
        	System.out.println("see Course: "+st);
        }
        ArrayList<Grade> gal = rw.getGradeList();
        for(Grade st : gal){
            
        	System.out.println("see Grade: "+st);
        }
        ArrayList<Enrollment> eal = rw.getEnrollList();
        for(Enrollment st : eal){
            
        	System.out.println("see enroll : "+st);
        }
    }
    
    public void clear(){
        
    	File file = new File("students.txt");
        file.delete();
        file = new File("overview.txt");
        file.delete();
        file = new File("courses.txt");
        file.delete();
        file = new File("grades.txt");
        file.delete();
        file = new File("enroll.txt");
        file.delete();
    }
    
    public void writeStudent(Student stud){

    }
    
    public void setEnrollList(ArrayList<Enrollment> al){
        
    	try {
            File foverview = new File("enroll.txt");
            foverview.delete();
            foverview.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("enroll.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (Enrollment st : al) {
                System.out.println("set : "+st);
                o.writeObject(st);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Enrollment> getEnrollList(){
        
    	ArrayList<Enrollment> al = new ArrayList<>();
        try{
            File foverview = new File("enroll.txt");
            if(!foverview.exists()) foverview.createNewFile();
            FileInputStream fi = new FileInputStream(new File("enroll.txt"));
            if(fi.available()==0) return al;
            ObjectInputStream oi = new ObjectInputStream(fi);
            while(fi.available() !=0){
                Enrollment st = (Enrollment) oi.readObject();
                System.out.println("get : "+st);
                al.add(st);
            }
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public void setGradeList(ArrayList<Grade> al){
        
    	try {
            File foverview = new File("grades.txt");
            foverview.delete();
            foverview.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("grades.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (Grade st : al) {
                System.out.println("set : "+st);
                o.writeObject(st);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Grade> getGradeList(){
       
    	ArrayList<Grade> al = new ArrayList<>();
        try{
            File foverview = new File("grades.txt");
            if(!foverview.exists()) foverview.createNewFile();
            FileInputStream fi = new FileInputStream(new File("grades.txt"));
            if(fi.available()==0) return al;
            ObjectInputStream oi = new ObjectInputStream(fi);
            while(fi.available() !=0){
                Grade st = (Grade) oi.readObject();
                System.out.println("get : "+st);
                al.add(st);
            }
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public void setCoursetList(ArrayList<Course> al){
        
    	try {
            File foverview = new File("courses.txt");
            foverview.delete();
            foverview.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("courses.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (Course st : al) {
                System.out.println("set : "+st);
                o.writeObject(st);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Course> getCourseList(){
        
    	ArrayList<Course> al = new ArrayList<>();
        try{
            File foverview = new File("courses.txt");
            if(!foverview.exists()) foverview.createNewFile();
            FileInputStream fi = new FileInputStream(new File("courses.txt"));
            if(fi.available()==0) return al;
            ObjectInputStream oi = new ObjectInputStream(fi);
            while(fi.available() !=0){
                Course st = (Course) oi.readObject();
                System.out.println("get : "+st);
                al.add(st);
            }
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public void setStudentList(ArrayList<Student> al){
        
    	try {
            File foverview = new File("students.txt");
            foverview.delete();
            foverview.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("students.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (Student st : al) {
                System.out.println("set : "+st);
                o.writeObject(st);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
        	Logger.getLogger(Reader_Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Student> getStudentList(){
        
    	ArrayList<Student> al = new ArrayList<>();
        try{
            File foverview = new File("students.txt");
            if(!foverview.exists()) foverview.createNewFile();
            FileInputStream fi = new FileInputStream(new File("students.txt"));
            if(fi.available()==0) return al;
            ObjectInputStream oi = new ObjectInputStream(fi);
            while(fi.available() !=0){
                Student st = (Student) oi.readObject();
                System.out.println("get : "+st);
                al.add(st);
            }
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public void readCourse(){

    }
    
    public void readEnroll(){

    }
    
    public void writeOverview(Overview over){
        
    	try {
            File view = new File("overview.txt");
            if(!view.exists()) view.createNewFile();
            FileOutputStream f = new FileOutputStream(new File("overview.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(over);
            System.out.println("set : " + over);
            o.close();
            f.close();
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Overview readOverview(){
        
    	Overview ov = null;
        try{
            File view = new File("overview.txt");
            if(!view.exists()) view.createNewFile();
            FileInputStream fi = new FileInputStream(new File("overview.txt"));
            if(fi.available()==0){
                return null;
            }
            ObjectInputStream oi = new ObjectInputStream(fi);
            ov = (Overview) oi.readObject();
            System.out.println("read : "+ov);
            oi.close();
            fi.close();
        }catch (FileNotFoundException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch(EOFException ex){
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            
        	Logger.getLogger(student_info.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ov;
    }
     
}

// I've created this two classes below to pass the zip code as a argument and to then
// retreive the json data back into the jtextfield of city and state of the Student class. 

class ZipCodeClient{
	
	private static final String BASE_URL = "https://ziptasticapi.com/";
	
	private static String API_URL = BASE_URL + "90230";
	
	public void setAPIURL(String zipCode) {
	
		API_URL = BASE_URL + zipCode;
	}

    public static void main(String[] args) throws IOException {
        	
    	URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        
        Gson gson = new Gson();
        ZipCode zipCode = gson.fromJson(response.toString(), ZipCode.class);
        
        System.out.println(zipCode.getCountry());
        System.out.println(zipCode.getState());
        System.out.println(zipCode.getCity());
    }
}

class ZipCode implements Serializable{
	   
	private static final long serialVersionUID = 1L;
	
    private String country;
    private String state;
    private String city;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

// Im trying to solve two things in this project:
// 1. Is to convert my Student and Course classes into a Generic Link List type
// 2. Is to run my zip code "zip.getText()" through my api and retreive the data to city and state jtextfields
//    when im clicking the search button on the project 

