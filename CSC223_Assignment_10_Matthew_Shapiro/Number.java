
class Number {

    private int number;
    private int count = 0;

    public Number(int num) {
        number = num;
        count += 1;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

}