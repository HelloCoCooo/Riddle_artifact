module.exports = function(config) {
    config.set({
        basePath: "${basedir}",
        frameworks: ['jasmine'],
        files: [
            '${project.build.outputDirectory}/assets/square.js',
            'src/test/javascript/*Spec.js'
        ],
        exclude: ['src/test/javascript/karma.conf*.js'],
        port: 9876,
        logLevel: config.LOG_INFO,
        browsers: ['PhantomJS'],
        singleRun: true,
        plugins: [
            'karma-jasmine',
            'karma-phantomjs-launcher',
            'karma-junit-reporter'
        ],
        reporters:['progress', 'junit'],
        junitReporter: {
            outputFile: 'target/surefire-reports/karma-test-results.xml',
            suite: ''
        }
    });
};