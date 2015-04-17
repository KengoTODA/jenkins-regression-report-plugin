package jp.skypencil.jenkins.regression;

import hudson.tasks.junit.CaseResult;
import hudson.tasks.test.TestResult;

import com.google.common.base.Predicate;

class RegressionPredicate implements Predicate<TestResult> {
    @Override
    public boolean apply(TestResult input) {
        if (input instanceof CaseResult) {
            CaseResult caseResult = (CaseResult) input;
            return caseResult.getStatus().isRegression();
        }
        return false;
    }
}
