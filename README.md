<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![MIT License][license-shield]][license-url]
[![Issues][issues-shield]][issues-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://gitlab.pg.innopolis.university/team20/llm-rosalind">
    <img src="images/logo.jfif" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">LLM Rosalind</h3>

  <p align="center">
    New way of education!
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Run API</a></li>
        <li><a href="#installation">Run frontend</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

![LLM Rosalind Screen Shot][product_screenshot]

LLM Rosalind is unique solution for studing and creating new courses. 

Here's why:
* Auto generations of courses from sources with use of LLM
* Graph representation of tasks
* Intuitive and beautiful interface

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* NextJS
* FastAPI
* Postgres


<p align="right">(<a href="#readme-top">back to top</a>)</p>



## Run API
Get reposetory
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -branch feature_refactor_backend
```
Setup envoirement
```sh
pip install -r requirements.txt
```
Setup the .env file
```
# For database
POSTGRES_DB=someDB
POSTGRES_USER=someUser
POSTGRES_PASSWORD=somePW
POSTGRES_HOST=0.0.0.0
POSTGRES_PORT=9999
# For static files
STATIC_FILES_UPLOAD_PATH=\path\to\folder
STATIC_FILES_DOWNLOAD_PATH=\path\to\folder
```
Run API
```sh
python -m src.backend.api
```
## Run frontend
Get reposetory
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -branch feature/main-page
```
Setup envoirement
```sh
npm install
```
Run frontend
```sh
npm run dev
```


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

1. Analysis
 [ ] - Initial meeting with the customer
 * Collecting requirements
 * Analyzing the problem
2. Design READY
 * Designing the initial GUI
 * Designing API endpoint design
 * Designing EDR
 * Designing ML pipeline
3. MVP-v0 READY
 * Adjusting GUI to the customer's feedback
 * Implementing the main page
4. MVP-v1 READY
 * Adjusting GUI to the customer's feedback
 * Adjusting the main page to the customer's feedback
 * Implementing course preview page
 * Implementing tree view page
 * Implementing theory view page
5. MVP-v2 IN PROCESS
 * Implementing task view page
 * Implementing user progress view
 * Implementing course addition view
 * Implementing theory editing view
 * Conducting a comprehensive code review
6. MVP-v3 IN PROCESS
 * Integrating with InnoDataHub
 * Implementing tree editing view
 * Implementing task editing view
7. MVP-v4 IN PROCESS
 * Assembling AES projects into InnoDataHub
 * Fixing critical bugs
 * Preparing for the demo day

See the [open issues](https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact
Dinislam Gabitov - d.gabitov@innopolis.university
Egor Chernobrovkin - e.chernobrovkin@innopolis.university
Marsel Berheev - m.berheev@innopolis.university
Nikita Stepankov - n.stepankov@innopolis.university
Nikita Tiurkov - n.tiurkov@innopolis.university
Oleg Shchendrigin - o.shchendrigin@innopolis.university
Valeriia Neganova - v.neganova@innopolis.university
Vladimir Bazilevich - v.bazilevich@innopolis.university
Andrey Palaev - a.palaev@innopolis.university
Michail Rudakov - m.rudakov@innopolis.university

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## acknowledgement

* [FastAPI](https://fastapi.tiangolo.com)
* [Best Chanel](https://www.youtube.com/watch?v=xvFZjo5PgG0)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
[license-url]: LICENSE.md
[contributors-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/graphs/feature_refactor_backend?ref_type=heads
[product_screenshot]: images/llmrosalind.png
[license-shield]: https://img.shields.io/badge/License-MIT-blue?style=flat
[issues-shield]: https://img.shields.io/badge/Issues-20-orange?style=flat
[issues-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues
[contributors-shield]: https://img.shields.io/badge/Contrbutors-10-green?style=flat&link=https%3A%2F%2Fgitlab.pg.innopolis.university%2Fteam20%2Fllm-rosalind


