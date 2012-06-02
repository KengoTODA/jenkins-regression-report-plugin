package jp.skypencil.jenkins.regression;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;
import hudson.Launcher;
import hudson.model.BuildListener;
import hudson.model.AbstractBuild;

import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegressionReportNotifierTest {
	private BuildListener listener;
	private Launcher launcher;
	private AbstractBuild<?, ?> build;

	@Before
	public void setUp() {
		listener = mock(BuildListener.class);
		launcher = mock(Launcher.class);
		build = mock(AbstractBuild.class);
		PrintStream logger = mock(PrintStream.class);
		doReturn(logger).when(listener).getLogger();
	}

	@Test
	public void testCompileErrorOccured() throws InterruptedException, IOException {
		doReturn(null).when(build).getTestResultAction();
		RegressionReportNotifier notifier = new RegressionReportNotifier("");

		assertThat(notifier.perform(build, launcher, listener), is(true));
	}

}
