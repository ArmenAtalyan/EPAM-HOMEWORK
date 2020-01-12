

public class University {

    public int getAverageMark(Faculty[] faculties, String subject) {
        int sum = 0;

        for (int i = 0; i < faculties.length; i++){
            sum += faculties[i].getAverageMark();
        }
        return sum/faculties.length;
    }
}
