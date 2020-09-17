- Windows
    - 查看被占用端口对应的 PID
        - netstat -aon|findstr "8008"
    - 查看指定 PID 的进程
        - tasklist|findstr "9088"

- Linux
    - lsof(list open files)
        - lsof -i:端口号
    - netstat -tunlp | grep 端口号