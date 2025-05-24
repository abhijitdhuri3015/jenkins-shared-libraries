def call(string url, string branch){
  echo "Clonning Code"
  git url: "${url}", branch: "${branch}"
  echo "Clonning completed"
}
