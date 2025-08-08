FROM nginx:alpine
COPY index.html /usr/share/nginx/html
#my port
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
HEALTHCHECK CMD curl --fail http://localhost || exit 1
