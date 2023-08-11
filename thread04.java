class MyThread implements Runnable{
        int num;
        MyThread(int num){
                this.num=num;
        }
        public void run(){
                System.out.println(Thread.currentThread()+"start Thread"+ num);
                dailyTask();
                 System.out.println(Thread.currentThread()+"End Thread"+ num);
        }
        void dailyTask(){
                try{
                        Thread.sleep(8000);
                }
                catch(InterruptedException ie){
                }
        }
}
class ThreadpoolDemo{
        public static void main(String[] ar){
                executorservices ser = executors . new cachedThreadpool();
                for(int i = 0; i<6;i++){
                        MyThread obj = new MyThread(i);
                        ser.execute(obj);
                }
                ser.shatdown();
        }
}
