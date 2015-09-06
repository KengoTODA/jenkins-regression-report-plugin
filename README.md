Jenkins regression report plugin
================================
This plugin sends a mail if your test cases find regressions.

![built and tested on DEV@cloud](http://static-www.cloudbees.com/images/badges/BuiltOnDEV.png)

A Jenkins plugin which solves one common problem to introduce CI to legacy project: a lot of failed tests hide regression (new failed bug).

Legacy project may have a lot of failed tests. In this case, finding regression is little difficult. It also keeps build result unstable, so benefit of CI will be limited and project members may not pay attention on it.
This plugin helps you to find regression even in this case. It should be helpful to introduce CI to your daily job.

Scenario
--------
 * Importing CI into running project
   * Sometimes project have a lot of red tests
   * In this situation, finding regression (new red test cases) is little difficult
   * This plugin helps you to find them

Screen shot
-----------
![screen shot of configure](https://raw.github.com/jenkinsci/regression-report-plugin/master/screenshot.png)

Changelog
---------
### 1.0
- first release

### 1.1
- send mail to culprit [#1](https://github.com/jenkinsci/regression-report-plugin/issues/1)

### 1.2
- fix #5 NoSuchMethodError

### 1.3
- upgrade Jenkins to the latest LTS (1.596)

### 1.4
- upgrade Jenkins to the latest LTS (1.609.3)

Copyright and license
---------------------
Copyright 2012-2015 Kengo TODA (eller86)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
