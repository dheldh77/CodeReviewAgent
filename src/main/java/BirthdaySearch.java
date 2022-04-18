public class BirthdaySearch implements SearchPolicy {
    InputOption inputOption;
    Employee emp;
    String source;


    BirthdaySearch(){}
    @Override
    public boolean search(Employee emp, String source) {
        inputOption = InputOption.getInstance();
        this.emp = emp;
        this.source=source;
        //option2값이 없는경우
        if(inputOption.isActivatedOption(Option.NONE)){
            return matchAll(source);
        }
        //option2값이 있는경우
        return matchPart();
    }

    private boolean matchAll(String source) {
        return source.equals(emp.getBirthDate());
    }

    private boolean matchPart(){
        if((inputOption.isActivatedOption(Option.YEAR) && source.equals(emp.getBirthYear())) ||  (inputOption.isActivatedOption(Option.MIDDLE_OR_MONTH) && source.equals(emp.getBirthMonth())) || (inputOption.isActivatedOption(Option.DAY) && source.equals(emp.getBirthDay())))
            return true;
        return false;
    }
}