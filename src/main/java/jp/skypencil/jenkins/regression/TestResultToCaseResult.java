package jp.skypencil.jenkins.regression;

import hudson.tasks.junit.CaseResult;
import hudson.tasks.test.TestResult;

import com.google.common.base.Function;

class TestResultToCaseResult implements Function<TestResult, CaseResult> {
    @Override
    public CaseResult apply(TestResult input) {
        return (CaseResult) input;
    }
}
