
1. Create github repo
2. Create spring starter project
3. Annotate the main class
4. Set GIT url in application yml
5. Run as spring boot app
6. Experiment with search paths, queries
7. Pull values from different git repo url


https://github.com/hariselvam1991/techbruiser-spring-cloudconfig-wa-tolls


http://localhost:8888/s1rates/default/main
http://localhost:8888/s2rates/default/main
http://localhost:8888/s2rates/dev/main

http://localhost:8888/s2rates/perf/main -- pulls data from perf git repo
http://localhost:8888/s3rates/perf/main -- pulls data from perf git repo

#One config server pointing to multiple git reposotiries pulling the right configuration that matches the search pattern.