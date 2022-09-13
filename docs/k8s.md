# 创建pod并生成yaml
```shell
kubectl create deployment [application-name] --image=[remote-image-url] --dry-run -o yaml > [application-name].yaml
```

# 配置 pod
```shell
kubect apply -f [application-name].yaml
```



# 应用扩缩容
```shell
kubectl scale deployment [application-name] --replicas=3
```


# 对外暴露端口
```shell
kubectl expose [application-name] --port=[对外暴露端口] --target-port=[本身端口] --type=NodePort
```
