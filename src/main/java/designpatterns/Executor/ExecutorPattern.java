package designpatterns.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPattern {

    ExecutorService executor = Executors.newFixedThreadPool(5);
}
