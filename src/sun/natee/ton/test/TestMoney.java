package sun.natee.ton.test;


public class TestMoney {
    public void test() {
        Test t = new Test();
        t.setCount(5);
        t.setNumber(12);
        
        setTestNew(t);
        
        
        System.out.println(t.getCount());
        System.out.println(t.getNumber());
    }
    
    public static void main(String[] args) {
        new TestMoney().test();
    }

    private void setTestNew(Test t) {
        t.setNumber(9);
    }
    
    class Test{
        private int count=0;
        private int number=0;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
