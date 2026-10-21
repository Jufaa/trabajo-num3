package ar.edu.unrc.game2048;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import java.io.PrintWriter;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class DaikonTestRunner {
    public static void main(String[] args) {
        LauncherDiscoveryRequest request =
                LauncherDiscoveryRequestBuilder.request()
                        .selectors(selectClass(CellTest.class))
                        .selectors(selectClass(BoardTest.class))
                        .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener =
                new SummaryGeneratingListener();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        listener.getSummary().printTo(new PrintWriter(System.out));

        if (listener.getSummary().getTotalFailureCount() > 0) {
            System.exit(1);
        }
    }
}