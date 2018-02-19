Run selenium in docker:

```
docker pull selenium/standalone-chrome-debug
docker run -d -P -p 5900:5900 -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome-debug
```

spy on it with VNC: `open vnc://localhost:5900`

run `mvn test` to run the tests

I'm using vscode with the java plugin for editing and it seems to work OK
