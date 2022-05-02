build:
	sudo docker build -t demo-app:1.0 .

run:
	sudo docker-compose up -d

all: build run
