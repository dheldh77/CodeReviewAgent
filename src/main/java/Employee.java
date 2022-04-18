public class Employee {
    private Name name;
    private EmployeeNumber employeeNum;
    private PhoneNumber phoneNum;
    private Birthday birthday;
    private String Career;
    private String Certi;
    public Employee(String name, String employeeNum, String phoneNum, String birthday, String cl, String certi){
        setEmployee(name, employeeNum, phoneNum, birthday, cl, certi);
    }

    public void setEmployee(String name, String employeeNum, String phoneNum, String birthday, String cl, String Certi){
        this.name = new Name(name);
        this.employeeNum = new EmployeeNumber(employeeNum);
        this.phoneNum = new PhoneNumber(phoneNum);
        this.birthday = new Birthday(birthday);
        this.Career = cl;
        this.Certi = Certi;
    }

    public String getName() {return name.getName();}
    public String getFirstName() {return name.getFirstName();}
    public String getSecondName() {return name.getSecondName();}

    public void setName(String name) {this.name.setName(name);}
    public void setFirstName(String firstName) {this.name.setFirstName(firstName);}
    public void setSecondName(String secondName) {this.name.setSecondName(secondName);}

    public String getEmpNum() {return employeeNum.getEmployeeNumber();}
    public int getEmpNumYear() {return employeeNum.getYear();}
    public int getEmpNumSecondNum() {return employeeNum.getSecondNum();}

    public void setEmployeeNum(String employeeNum) {this.employeeNum.setEmployeeNumber(employeeNum);}

    public String getPhoneNum() {return phoneNum.getPhoneNum();}
    public String getPhoneMiddleNum() {return phoneNum.getMiddleNum();}
    public String getPhoneEndNum() {return phoneNum.getEndNum();}

    public void setPhoneNum(String phoneNum) {this.phoneNum.setPhoneNum(phoneNum);}
    public void setPhoneMiddleNum(String middleNum) {this.phoneNum.setMiddleNum(middleNum);}
    public void setPhoneEndNum(String endNum){this.phoneNum.setEndNum(endNum);}

    public String getBirthDate() { return birthday.getBirthday();}
    public String getBirthYear() {return birthday.getYear();}
    public String getBirthMonth() {return birthday.getMonth();}
    public String getBirthDay() {return birthday.getDay();}

    public void setBirthDate(String birthDate) {this.birthday.setBirthday(birthDate);}
    public void setBirthYear(String birthYear) {this.birthday.setYear(birthYear);}
    public void setBirthMonth(String birthMonth) {this.birthday.setMonth(birthMonth);}
    public void setBirthDay(String birthDay) {this.birthday.setDay(birthDay);}

    public String getCareer() {return Career;}

    public void setCareer(String Career) {this.Career = Career;}

    public String getCerti() {return Certi;}

    public void setCerti(String Certi) {this.Certi = Certi;}
}
