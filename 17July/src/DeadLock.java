import javax.swing.plaf.TableHeaderUI;

class Pen{
 public synchronized void writeWithPenAndPaper(Paper paper)
 {
     System.out.println(Thread.currentThread().getName()+" is using pen "+this);
     paper.finishWriting();
 }
public synchronized void finishWriting()
{
    System.out.println(Thread.currentThread().getName()+" Finished using Pen "+ this);
}
}
class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen)
    {
        System.out.println(Thread.currentThread().getName()+" is using Paper "+this);
        pen.finishWriting();
    }
    public synchronized void finishWriting()
    {
        System.out.println(Thread.currentThread().getName()+" Finished using Pen "+ this);
    }
}

class Task1 implements Runnable{
    Paper paper;
    Pen pen;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable{
    Paper paper;
    Pen pen;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen)
        {
            paper.writeWithPaperAndPen(pen);
        }

    }
}


public class DeadLock {

    public static void main(String[] args) {

        Paper paper = new Paper();
        Pen pen = new Pen();

        Thread t1 = new Thread(new Task1(pen, paper));
        Thread t2 = new Thread(new Task2(pen, paper));

        t1.start();
        t2.start();
    }
}
