package lejos.nxt;

/**
 * Motor class contains 3 instances of regulated motors.
 * <p>
 * Example:<p>
 * <code><pre>
 *   Motor.A.setSpeed(720);// 2 RPM
 *   Motor.C.setSpeed(720);
 *   Motor.A.forward();
 *   Motor.C.forward();
 *   Thread.sleep (1000);
 *   Motor.A.stop();
 *   Motor.C.stop();
 *   Motor.A.rotateTo( 360);
 *   Motor.A.rotate(-720,true);
 *   while(Motor.A.isMoving() :Thread.yield();
 *   int angle = Motor.A.getTachoCount(); // should be -360
 *   LCD.drawInt(angle,0,0);
 * </pre></code>
 * @author Roger Glassey/Andy Shaw
 */
public class Motor
{
    /**
     * Motor A.
     */
    public static final NXTRegulatedMotor A = new NXTRegulatedMotor(MotorPort.A);
    /**
     * Motor B.
     */
    public static final NXTRegulatedMotor B = new NXTRegulatedMotor(MotorPort.B);
    /**
     * Motor C.
     */
    public static final NXTRegulatedMotor C = new NXTRegulatedMotor(MotorPort.C);
    
    private Motor() {
    	// Motor class cannot be instantiated
    }
}
