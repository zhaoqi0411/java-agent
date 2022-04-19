import java.lang.instrument.Instrumentation;

public class Agent {

    //    public static void premain(String agentArgs) {
//        System.out.println("我是一个萌萌哒的 Java Agent");
//        try {
//            Thread.sleep(2000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public static void premain(String agentArgs, Instrumentation instrumentation)  {

        System.out.println("Agent 在类加载之前进行插桩="+instrumentation.toString());
        instrumentation.addTransformer(new ClassFileTransformerDemo(),true);

    }

}
